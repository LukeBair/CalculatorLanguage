// Generated from /Users/lukebair/Library/Mobile Documents/com~apple~CloudDocs/IdeaProjects/CalculatorLanguage/src/CalculatorLanguage.g4 by ANTLR 4.9.1
package CalculatorLanguageInterpreter;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorLanguageParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CalculatorLanguageParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CalculatorLanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorLanguageParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(CalculatorLanguageParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorLanguageParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(CalculatorLanguageParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorLanguageParser#subtract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract(CalculatorLanguageParser.SubtractContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorLanguageParser#multiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(CalculatorLanguageParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorLanguageParser#divide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(CalculatorLanguageParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorLanguageParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(CalculatorLanguageParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorLanguageParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(CalculatorLanguageParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorLanguageParser#openParenthese}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenParenthese(CalculatorLanguageParser.OpenParentheseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorLanguageParser#closeParenthese}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseParenthese(CalculatorLanguageParser.CloseParentheseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorLanguageParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CalculatorLanguageParser.NumberContext ctx);
}