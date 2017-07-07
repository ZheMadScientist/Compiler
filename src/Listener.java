import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ParserRuleContext;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.lang.Class.forName;

/**
 * Created by MakarOn on 06.07.2017.
 */
public class Listener extends CPPgrammarBaseListener {
    String code = "";

    @Override
    public void enterInbrackets(CPPgrammarParser.InbracketsContext ctx) {

    }

    @Override
    public void exitInbrackets(CPPgrammarParser.InbracketsContext ctx) {

    }

    @Override
    public void enterInnsqbrackets(CPPgrammarParser.InnsqbracketsContext ctx) {

    }

    @Override
    public void exitInnsqbrackets(CPPgrammarParser.InnsqbracketsContext ctx) {


    }

    @Override
    public void enterOperation(CPPgrammarParser.OperationContext ctx) {
        code += ctx.getText() + "\n";

    }

    @Override
    public void exitOperation(CPPgrammarParser.OperationContext ctx) {

    }

    @Override
    public void enterMult_operation(CPPgrammarParser.Mult_operationContext ctx) {

    }

    @Override
    public void exitMult_operation(CPPgrammarParser.Mult_operationContext ctx) {

    }

    @Override
    public void enterTyping(CPPgrammarParser.TypingContext ctx) {
        String alltext = ctx.getText();
        String temp = alltext;
        if(temp.contains("string")){
            temp = temp.replace("string", "String ");
        }
        if(temp.contains("double")){
            temp = temp.replace("double", "double ");
        }
        code += temp;
    }

    @Override
    public void exitTyping(CPPgrammarParser.TypingContext ctx) {
        code += System.lineSeparator();
    }

    @Override
    public void enterAssignment(CPPgrammarParser.AssignmentContext ctx) {
        String[] sub = ctx.getText().split("\\=");
        code += sub[0] + " = " + sub[1];
    }

    @Override
    public void exitAssignment(CPPgrammarParser.AssignmentContext ctx) {
        code += System.lineSeparator();
    }

    @Override
    public void enterMain(CPPgrammarParser.MainContext ctx) {
        code += "public static void main(String[] args){ \n";
    }

    @Override
    public void exitMain(CPPgrammarParser.MainContext ctx) {
        code += "\n }";
    }

    @Override
    public void enterPrinting(CPPgrammarParser.PrintingContext ctx) {
        String temp = ctx.getText();
        temp = temp.replace("printf(", "");
        temp = temp.replace("cout<<", "");
        temp = temp.replace("cout <<", "");
        temp = temp.replace("<<endl", "");
        temp = temp.replace("<< endl", "");
        temp = temp.substring(0, temp.length()-1);
        code += "System.out.println(" + temp + ");";
    }

    @Override
    public void exitPrinting(CPPgrammarParser.PrintingContext ctx) {
        code += System.lineSeparator();
    }

    @Override
    public void enterStructuring(CPPgrammarParser.StructuringContext ctx) {
        String className = ctx.ID().getText();
        code += "class " + className + " { \n";
    }

    @Override
    public void exitStructuring(CPPgrammarParser.StructuringContext ctx) {
        code += "\n }\n";
    }

    @Override
    public void enterDeclaring(CPPgrammarParser.DeclaringContext ctx) {
        String firstID = ctx.ID(0).getText();
        code += firstID + " " + ctx.getText().replace(firstID, "");
    }

    @Override
    public void exitDeclaring(CPPgrammarParser.DeclaringContext ctx) {
        code += System.lineSeparator();
    }

    @Override
    public void enterBlock(CPPgrammarParser.BlockContext ctx) {
        System.out.println("ENTER");
        code += "class Wrapper{\n";
    }

    @Override
    public void exitBlock(CPPgrammarParser.BlockContext ctx) {
        code += "\n }";
        System.out.println(code);
        System.out.println("EXIT");
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public void enterExpr(CPPgrammarParser.ExprContext ctx) {
    }

    @Override
    public void exitExpr(CPPgrammarParser.ExprContext ctx) {

    }
    public String getCode(){
        return code;
    }
}
