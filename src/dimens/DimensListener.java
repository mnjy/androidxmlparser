// Generated from src\dimens\Dimens.g4 by ANTLR 4.4

package dimens;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DimensParser}.
 */
public interface DimensListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DimensParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull DimensParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull DimensParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimensParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull DimensParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull DimensParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimensParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(@NotNull DimensParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(@NotNull DimensParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimensParser#close}.
	 * @param ctx the parse tree
	 */
	void enterClose(@NotNull DimensParser.CloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensParser#close}.
	 * @param ctx the parse tree
	 */
	void exitClose(@NotNull DimensParser.CloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimensParser#open}.
	 * @param ctx the parse tree
	 */
	void enterOpen(@NotNull DimensParser.OpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensParser#open}.
	 * @param ctx the parse tree
	 */
	void exitOpen(@NotNull DimensParser.OpenContext ctx);
}