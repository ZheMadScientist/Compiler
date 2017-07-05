import org.antlr.runtime.*;
import org.antlr.v4.codegen.target.CppTarget;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;


/**
 * Created by MakarOn on 05.07.2017.
 */
public class Interpretor {


    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Javalib\\res\\test.txt");

            List<String> temp = Files.readAllLines(path, Charset.forName("UTF-8"));



            String p = "";
            for(Iterator<String> i = temp.iterator(); i.hasNext();){
                p += i;
            }
            final String input = p;


            ANTLRInputStream inputStream = new ANTLRInputStream(new InputStream() {
                @Override
                public int read() throws IOException {
                    char c = 'p';
                    for(int i = 0; i < input.length(); i++) {
                        c = input.charAt(i);
                    }
                    return c;
                }
            });

            CPPgrammarLexer lexer = new CPPgrammarLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            CPPgrammarParser parser = new CPPgrammarParser(commonTokenStream);

            CPPgrammarListener listener = new CPPgrammarBaseListener();
            listener.enterEveryRule(parser.getRuleContext());

    }
}
