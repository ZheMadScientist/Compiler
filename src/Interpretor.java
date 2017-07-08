import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
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

/**
 * Created by MakarOn on 06.07.2017.
 */
public class Interpretor {

    public static class Helper{
        static String path;
        static String outPath;
        Helper(){
            //URL url = getClass().getResource("res/test.txt");

            path = System.getProperty("user.dir") + "\\res\\test.txt";

            outPath = System.getProperty("user.dir") + "\\res\\Java\\output.java";
        }
        static void outWrite(String code){
            String[] lines = code.split("\n");
            List<String> output = new ArrayList<>();
            for(int i = 0; i < lines.length; i++){
                output.add(lines[i]);
            }
            Path file = Paths.get(System.getProperty("user.dir") + "\\res\\Java\\output.java");
            try {
                Files.write(file, output, Charset.forName("UTF-8"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        final static int BUFFER_SIZE = 3000;
        static void createJarArchive(File archiveFile, File[] tobeJared) {
            try {
                byte buffer[] = new byte[BUFFER_SIZE];
                // Open archive file
                FileOutputStream stream = new FileOutputStream(archiveFile);
                Manifest manifest = new Manifest();
                manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");
                manifest.getMainAttributes().put(Attributes.Name.CLASS_PATH, "");
                manifest.getMainAttributes().put(Attributes.Name.MAIN_CLASS, "output");
                JarOutputStream out = new JarOutputStream(stream, manifest);

                for (int i = 0; i < tobeJared.length; i++) {
                    if (tobeJared[i] == null || !tobeJared[i].exists()
                            || tobeJared[i].isDirectory())
                        continue; // Just in case...
                    System.out.println("Adding " + tobeJared[i].getName());

                    // Add archive entry
                    JarEntry jarAdd = new JarEntry(tobeJared[i].getName());
                    jarAdd.setTime(tobeJared[i].lastModified());
                    out.putNextEntry(jarAdd);

                    // Write file to archive
                    FileInputStream in = new FileInputStream(tobeJared[i]);
                    while (true) {
                        int nRead = in.read(buffer, 0, buffer.length);
                        if (nRead <= 0)
                            break;
                        out.write(buffer, 0, nRead);
                    }
                    in.close();
                }

                out.close();
                stream.close();
                System.out.println("Adding completed OK");
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
    public static void main(String[] args) {

        StringBuffer buf = new StringBuffer("");
        Helper h = new Helper();
        try {
            System.out.println(h.path);
            File file = new File(h.path);

            FileInputStream in = new FileInputStream(file);

            int i;

            while ((i = in.read()) != -1) {

                // convert byte to char and append to StringBuffer

                buf.append((char) i);

            }
        } catch (Exception e) {
            System.out.println("ERROR");

        }

        String input = buf.toString();
        CPPgrammarLexer lexer = new CPPgrammarLexer(new ANTLRInputStream(input));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        CPPgrammarParser parser = new CPPgrammarParser(tokens);

        CPPgrammarParser.BlockContext tree = parser.block();

        // Specify our entry point
        // Walk it and attach our listener
        Listener listener = new Listener();
        //String code = listener.
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);

        Helper.outWrite(listener.getCode());
        File out = new File(System.getProperty("user.dir") + "\\res\\Jar\\output.jar");
        File toJar = new File(h.outPath);
        Helper.createJarArchive(out, new File[]{toJar});
    }
}
