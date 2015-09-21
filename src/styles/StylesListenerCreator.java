package styles;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import styles.StylesParser.*;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

//TODO
public class StylesListenerCreator extends StylesBaseListener {
	private HashMap<String, Text> texts;
	private HashSet<String> fonts;
	
	@Override
	public void exitStyle_def(Style_defContext ctx){
		String type = ctx.start_style_phrase().name_info().toString();
		
		//if it's not a text style, ignore it
		if (!type.startsWith("Sing.Text")){
			return;
		}
		String name = ctx.start_style_phrase().name_info().toString();
		
		String parent_name = ctx.start_style_phrase().parent_info().toString();
		Text parent = texts.get(parent_name);
		
		String font;
		int size;
		String color;
		
		//look for each attribute. If doesn't exist, look in parent, which should already have been defined
		Font_phraseContext font_phrase = ctx.font_phrase(0);
		if (font_phrase != null){
			font = font_phrase.NAME().toString();
			//TODO: note that these fonts are in the format "fonts/FONT_NAME.ttf". Need to refine that either here or in the actual list
		}
		else {
			font = parent.font;
		}
		
		Dimen_phraseContext dimen_phrase = ctx.dimen_phrase(0);
		if (dimen_phrase != null){
			size = Integer.parseInt(dimen_phrase.NAME().toString()); //TODO: INCORRECT! lookup int in dimens hashmap
		}
		else {
			size = parent.size;
		}
		
		Color_phraseContext color_phrase = ctx.color_phrase(0);
		if (color_phrase != null){
			color = color_phrase.NAME().toString(); //TODO: INCORRECT! lookup color in colors hashmap (which technically has not been created yet)
		}
		else {
			color = parent.color;
		}
		
		//cache
		Text text = new Text(name, font, size, color);
		texts.put(name, text);
	}
	
	@Override
	public void exitFont_phrase(Font_phraseContext ctx){
		String font = ctx.NAME().toString();
		fonts.add(font);
		//TODO: note that these fonts are in the format "fonts/FONT_NAME.ttf". Need to refine that either here or in the actual list
	}
	
	
	/**
	 * @return a map from text names to their attributes
	 */
	public HashMap<String, Text> getTexts() {
		return texts;
	}
	
	/**
	 * @return a set of all possible fonts
	 */
	public HashSet<String> getFonts() {
		return fonts;
	}
	
	public class Text {
		public final String name;
		public final String font;
		public final int size;
		public final String color;
		
		public Text(String name, String font, int size, String color){
			this.name = name;
			this.font = font;
			this.size = size;
			this.color = color;
		}
	}

}
