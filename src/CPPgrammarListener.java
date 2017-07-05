// Generated from CPPgrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CPPgrammarParser}.
 */
public interface CPPgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CPPgrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CPPgrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPgrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CPPgrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPgrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CPPgrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPgrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CPPgrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPgrammarParser#inbrackets}.
	 * @param ctx the parse tree
	 */
	void enterInbrackets(CPPgrammarParser.InbracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPgrammarParser#inbrackets}.
	 * @param ctx the parse tree
	 */
	void exitInbrackets(CPPgrammarParser.InbracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPgrammarParser#innsqbrackets}.
	 * @param ctx the parse tree
	 */
	void enterInnsqbrackets(CPPgrammarParser.InnsqbracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPgrammarParser#innsqbrackets}.
	 * @param ctx the parse tree
	 */
	void exitInnsqbrackets(CPPgrammarParser.InnsqbracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPgrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(CPPgrammarParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPgrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(CPPgrammarParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPgrammarParser#typing}.
	 * @param ctx the parse tree
	 */
	void enterTyping(CPPgrammarParser.TypingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPgrammarParser#typing}.
	 * @param ctx the parse tree
	 */
	void exitTyping(CPPgrammarParser.TypingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPgrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CPPgrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPgrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CPPgrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPgrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CPPgrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPgrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CPPgrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPgrammarParser#printing}.
	 * @param ctx the parse tree
	 */
	void enterPrinting(CPPgrammarParser.PrintingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPgrammarParser#printing}.
	 * @param ctx the parse tree
	 */
	void exitPrinting(CPPgrammarParser.PrintingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPgrammarParser#structuring}.
	 * @param ctx the parse tree
	 */
	void enterStructuring(CPPgrammarParser.StructuringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPgrammarParser#structuring}.
	 * @param ctx the parse tree
	 */
	void exitStructuring(CPPgrammarParser.StructuringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPgrammarParser#returning}.
	 * @param ctx the parse tree
	 */
	void enterReturning(CPPgrammarParser.ReturningContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPgrammarParser#returning}.
	 * @param ctx the parse tree
	 */
	void exitReturning(CPPgrammarParser.ReturningContext ctx);
}