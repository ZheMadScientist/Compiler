import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MakarOn on 06.07.2017.
 */
public class Interpretor {

    public static class Helper{
        static String path;
        Helper(){
            URL url = getClass().getResource("test.txt");
            path = url.getPath();

        }
        static void outWrite(String code){
            String[] lines = code.split("\n");
            List<String> output = new ArrayList<>();
            for(int i = 0; i < lines.length; i++){
                output.add(lines[i]);
            }
            Path file = Paths.get("output.java");
            try {
                Files.write(file, output, Charset.forName("UTF-8"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer("");
        try {
            Helper h = new Helper();
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
    }
}
