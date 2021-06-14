// Generated from /Users/lukebair/Library/Mobile Documents/com~apple~CloudDocs/IdeaProjects/CalculatorLanguage/src/CalculatorLanguage.g4 by ANTLR 4.9.1
package CalculatorLanguageInterpreter;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorLanguageParser}.
 */
public interface CalculatorLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorLanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalculatorLanguageParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorLanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalculatorLanguageParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculatorLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculatorLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorLanguageParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(CalculatorLanguageParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorLanguageParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(CalculatorLanguageParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorLanguageParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(CalculatorLanguageParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorLanguageParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(CalculatorLanguageParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorLanguageParser#subtract}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(CalculatorLanguageParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorLanguageParser#subtract}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(CalculatorLanguageParser.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorLanguageParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(CalculatorLanguageParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorLanguageParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(CalculatorLanguageParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorLanguageParser#divide}.
	 * @param ctx the parse tree
	 */
	void enterDivide(CalculatorLanguageParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorLanguageParser#divide}.
	 * @param ctx the parse tree
	 */
	void exitDivide(CalculatorLanguageParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorLanguageParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(CalculatorLanguageParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorLanguageParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(CalculatorLanguageParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorLanguageParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(CalculatorLanguageParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorLanguageParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(CalculatorLanguageParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorLanguageParser#openParenthese}.
	 * @param ctx the parse tree
	 */
	void enterOpenParenthese(CalculatorLanguageParser.OpenParentheseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorLanguageParser#openParenthese}.
	 * @param ctx the parse tree
	 */
	void exitOpenParenthese(CalculatorLanguageParser.OpenParentheseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorLanguageParser#closeParenthese}.
	 * @param ctx the parse tree
	 */
	void enterCloseParenthese(CalculatorLanguageParser.CloseParentheseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorLanguageParser#closeParenthese}.
	 * @param ctx the parse tree
	 */
	void exitCloseParenthese(CalculatorLanguageParser.CloseParentheseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorLanguageParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CalculatorLanguageParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorLanguageParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CalculatorLanguageParser.NumberContext ctx);
}