import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.lang.reflect.Method;
import java.util.Collection;

/**
 * Created by MakarOn on 06.07.2017.
 */
public class Parser {
    public Class parse(String code) {
        CharStream charStream = new ANTLRInputStream(code);
        CPPgrammarLexer lexer = new CPPgrammarLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        CPPgrammarParser parser = new CPPgrammarParser(tokens);

        ClassListener classListener = new ClassListener();
        //parser.classDeclaration().enterRule(classListener);
        return classListener.getParsedClass();
    }

    class ClassListener extends CPPgrammarBaseListener {

        private Class parsedClass;

        public Class getParsedClass() {
            return parsedClass;
        }
    }
}
