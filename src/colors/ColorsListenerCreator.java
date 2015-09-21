package colors;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import colors.ColorsParser.LineContext;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ColorsListenerCreator extends ColorsBaseListener {
	private HashMap<String, String> colors;
	
	@Override
	public void exitLine(LineContext ctx){
		String name = ctx.NAME().getText();
		String hex = ctx.HEX().getText();
		colors.put(name, hex);
	}
	
	/**
	 * @return a map from names of colors to hex codes
	 */
	public HashMap<String, String> getColors(){
		return colors;
	}
	
	/**
	 * @return all possible hex codes used
	 */
	public ArrayList<String> getAllColors(){
		return (ArrayList<String>) colors.values();
	}
}
