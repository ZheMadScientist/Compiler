import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import java.util.stream.Stream;

import static java.lang.System.out;

/**
 * Created by MakarOn on 06.07.2017.
 */
public class Interpretor {

    public static class Helper{
        static String path;
        static String outPath;
        Helper(){
            path = System.getProperty("user.dir") + "\\res\\tests";

            outPath = System.getProperty("user.dir") + "\\res\\Java\\Wrapper1.java";
        }
        static void outWrite(String code, String testName){
            String[] lines = code.split("\n");
            List<String> output = new ArrayList<>();
            for(int i = 0; i < lines.length; i++){
                output.add(lines[i]);
            }
            Path file = Paths.get(System.getProperty("user.dir") + "\\res\\Java\\" + testName + ".java");
            try {
                Files.write(file, output, Charset.forName("UTF-8"));
            } catch (IOException e) {
                e.printStackTrace();
            }


        }


        public  static void moveFiles() throws IOException {
            String path = System.getProperty("user.dir") + "\\res\\Java";
            String newPath = System.getProperty("user.dir") + "\\res\\Java.compiled\\";
            try (Stream<Path> paths = Files.walk(Paths.get(path))) {
                paths
                        .filter(Files::isRegularFile)
                        .forEach(x -> {
                            if(x.toString().endsWith("class")){
                                File f = x.toFile();
                                f.renameTo(new File(newPath + f.getName()));
                            }});
            }

        }

        public  static void cleanFolder() throws IOException {
            String path = System.getProperty("user.dir") + "\\res\\Java.compiled\\";
            try (Stream<Path> paths = Files.walk(Paths.get(path))) {
                paths
                        .filter(Files::isRegularFile)
                        .forEach(x -> x.toFile().delete());
            }

        }


    }


    public  static  void parseFile(File file) throws IOException {
        StringBuffer buf = new StringBuffer("");

        FileInputStream in = new FileInputStream(file);

        int i;

        while ((i = in.read()) != -1) {

            // convert byte to char and append to StringBuffer

            buf.append((char) i);
        }


        String input = buf.toString();
        CPPgrammarLexer lexer = new CPPgrammarLexer(new ANTLRInputStream(input));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        CPPgrammarParser parser = new CPPgrammarParser(tokens);

        CPPgrammarParser.BlockContext tree = parser.block();

        // Specify our entry point
        // Walk it and attach our listener
        Listener listener = new Listener(file.getName());
        //String code = listener.
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);

        String path =  System.getProperty("user.dir") + "\\res\\Java\\" + file.getName() + ".java";
        out.println(path);

        Helper.outWrite(listener.getCode(), file.getName());
        File toJar = new File(path);

        compileOut(toJar);
    }

    public static void main(String[] args) {
        try {
            Helper.cleanFolder();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Helper h = new Helper();
        try {

            try (Stream<Path> paths = Files.walk(Paths.get(h.path))) {
                paths
                        .filter(Files::isRegularFile)
                        .forEach(x -> {
                            try {
                                parseFile(x.toFile());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Helper.moveFiles();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void compileOut(File file){
        File root = new File(System.getProperty("user.dir") + "\\res\\Java");
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        compiler.run(null, out, out, file.getPath());

        try {
            URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { root.toURI().toURL() });

            Class<?> cls = Class.forName(file.getName().replace(".java", ""), true, classLoader);
            Object instance = cls.newInstance();

            out.println(instance);


        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
