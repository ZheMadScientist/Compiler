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

    @Override
    public void enterInbrackets(CPPgrammarParser.InbracketsContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override
    public void exitInbrackets(CPPgrammarParser.InbracketsContext ctx) {

    }

    @Override
    public void enterInnsqbrackets(CPPgrammarParser.InnsqbracketsContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override
    public void exitInnsqbrackets(CPPgrammarParser.InnsqbracketsContext ctx) {


    }

    @Override
    public void enterOperation(CPPgrammarParser.OperationContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override
    public void exitOperation(CPPgrammarParser.OperationContext ctx) {

    }

    @Override
    public void enterMult_operation(CPPgrammarParser.Mult_operationContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override
    public void exitMult_operation(CPPgrammarParser.Mult_operationContext ctx) {


    }

    @Override
    public void enterTyping(CPPgrammarParser.TypingContext ctx) {
        System.out.println(ctx.getText() + "TYPING ");
    }

    @Override
    public void exitTyping(CPPgrammarParser.TypingContext ctx) {

    }

    @Override
    public void enterAssignment(CPPgrammarParser.AssignmentContext ctx) {
        System.out.println(ctx.getText());

    }

    @Override
    public void exitAssignment(CPPgrammarParser.AssignmentContext ctx) {

    }

    @Override
    public void enterMain(CPPgrammarParser.MainContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override
    public void exitMain(CPPgrammarParser.MainContext ctx) {


    }

    @Override
    public void enterPrinting(CPPgrammarParser.PrintingContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override
    public void exitPrinting(CPPgrammarParser.PrintingContext ctx) {

    }

    @Override
    public void enterStructuring(CPPgrammarParser.StructuringContext ctx) {
        String className = ctx.ID().getText();
        System.out.println(className);
    }

    @Override
    public void exitStructuring(CPPgrammarParser.StructuringContext ctx) {

    }

    @Override
    public void enterReturning(CPPgrammarParser.ReturningContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override
    public void exitReturning(CPPgrammarParser.ReturningContext ctx) {

    }

    @Override
    public void enterDeclaring(CPPgrammarParser.DeclaringContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override
    public void exitDeclaring(CPPgrammarParser.DeclaringContext ctx) {


    }

    @Override
    public void enterBlock(CPPgrammarParser.BlockContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override
    public void exitBlock(CPPgrammarParser.BlockContext ctx) {
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
        System.out.println("enterExpr");
    }

    @Override
    public void exitExpr(CPPgrammarParser.ExprContext ctx) {

    }
}
