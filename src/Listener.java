import org.antlr.v4.runtime.ParserRuleContext;

import java.time.temporal.Temporal;

import static java.lang.System.out;

/**
 * Created by MakarOn on 06.07.2017.
 */
public class Listener extends CPPgrammarBaseListener {

    public Listener(String className){
        testName = className;
    }
    String testName = "";
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
        if(!code.contains(ctx.getText())) {
            code += ctx.getText() + "\n";
        }
    }

    @Override
    public void exitOperation(CPPgrammarParser.OperationContext ctx) {
        code += "\n";
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
        temp = temp.replace("=", " = ");
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
        code += "public static void main(String[] args){ \n \n" ;
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
        code += "public static class " + className + " { \n \n";
    }

    @Override
    public void exitStructuring(CPPgrammarParser.StructuringContext ctx) {
        code += "\n }\n";
    }

    @Override
    public void enterDeclaring(CPPgrammarParser.DeclaringContext ctx) {
        String temp = ctx.getText();
        String firstID = ctx.ID(0).getText();
        temp = temp.replace(firstID, "");
        temp = temp.replace(";","");
        code += firstID + " " + temp + " = new " + firstID + "();";
    }

    @Override
    public void exitDeclaring(CPPgrammarParser.DeclaringContext ctx) {
        code += System.lineSeparator();
    }

    @Override
    public void enterBlock(CPPgrammarParser.BlockContext ctx) {
        code += "public class " + testName + "{\n \n";
    }

    @Override
    public void exitBlock(CPPgrammarParser.BlockContext ctx) {
        code += "\n }";
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
