// Generated from src\styles\Styles.g4 by ANTLR 4.4

package styles;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StylesParser}.
 */
public interface StylesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StylesParser#name_info}.
	 * @param ctx the parse tree
	 */
	void enterName_info(@NotNull StylesParser.Name_infoContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesParser#name_info}.
	 * @param ctx the parse tree
	 */
	void exitName_info(@NotNull StylesParser.Name_infoContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesParser#end_style_phrase}.
	 * @param ctx the parse tree
	 */
	void enterEnd_style_phrase(@NotNull StylesParser.End_style_phraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesParser#end_style_phrase}.
	 * @param ctx the parse tree
	 */
	void exitEnd_style_phrase(@NotNull StylesParser.End_style_phraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesParser#ignore_phrase}.
	 * @param ctx the parse tree
	 */
	void enterIgnore_phrase(@NotNull StylesParser.Ignore_phraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesParser#ignore_phrase}.
	 * @param ctx the parse tree
	 */
	void exitIgnore_phrase(@NotNull StylesParser.Ignore_phraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesParser#style_def}.
	 * @param ctx the parse tree
	 */
	void enterStyle_def(@NotNull StylesParser.Style_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesParser#style_def}.
	 * @param ctx the parse tree
	 */
	void exitStyle_def(@NotNull StylesParser.Style_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesParser#font_phrase}.
	 * @param ctx the parse tree
	 */
	void enterFont_phrase(@NotNull StylesParser.Font_phraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesParser#font_phrase}.
	 * @param ctx the parse tree
	 */
	void exitFont_phrase(@NotNull StylesParser.Font_phraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesParser#color_phrase}.
	 * @param ctx the parse tree
	 */
	void enterColor_phrase(@NotNull StylesParser.Color_phraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesParser#color_phrase}.
	 * @param ctx the parse tree
	 */
	void exitColor_phrase(@NotNull StylesParser.Color_phraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesParser#dimen_phrase}.
	 * @param ctx the parse tree
	 */
	void enterDimen_phrase(@NotNull StylesParser.Dimen_phraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesParser#dimen_phrase}.
	 * @param ctx the parse tree
	 */
	void exitDimen_phrase(@NotNull StylesParser.Dimen_phraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull StylesParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull StylesParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesParser#start_style_phrase}.
	 * @param ctx the parse tree
	 */
	void enterStart_style_phrase(@NotNull StylesParser.Start_style_phraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesParser#start_style_phrase}.
	 * @param ctx the parse tree
	 */
	void exitStart_style_phrase(@NotNull StylesParser.Start_style_phraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(@NotNull StylesParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(@NotNull StylesParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesParser#close}.
	 * @param ctx the parse tree
	 */
	void enterClose(@NotNull StylesParser.CloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesParser#close}.
	 * @param ctx the parse tree
	 */
	void exitClose(@NotNull StylesParser.CloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesParser#open}.
	 * @param ctx the parse tree
	 */
	void enterOpen(@NotNull StylesParser.OpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesParser#open}.
	 * @param ctx the parse tree
	 */
	void exitOpen(@NotNull StylesParser.OpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link StylesParser#parent_info}.
	 * @param ctx the parse tree
	 */
	void enterParent_info(@NotNull StylesParser.Parent_infoContext ctx);
	/**
	 * Exit a parse tree produced by {@link StylesParser#parent_info}.
	 * @param ctx the parse tree
	 */
	void exitParent_info(@NotNull StylesParser.Parent_infoContext ctx);
}