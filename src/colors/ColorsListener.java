// Generated from src\colors\Colors.g4 by ANTLR 4.4

package colors;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ColorsParser}.
 */
public interface ColorsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ColorsParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull ColorsParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorsParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull ColorsParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorsParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull ColorsParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorsParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull ColorsParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorsParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(@NotNull ColorsParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorsParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(@NotNull ColorsParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorsParser#close}.
	 * @param ctx the parse tree
	 */
	void enterClose(@NotNull ColorsParser.CloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorsParser#close}.
	 * @param ctx the parse tree
	 */
	void exitClose(@NotNull ColorsParser.CloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ColorsParser#open}.
	 * @param ctx the parse tree
	 */
	void enterOpen(@NotNull ColorsParser.OpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ColorsParser#open}.
	 * @param ctx the parse tree
	 */
	void exitOpen(@NotNull ColorsParser.OpenContext ctx);
}