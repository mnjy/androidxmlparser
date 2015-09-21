package dimens;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import dimens.DimensParser.LineContext;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DimensListenerCreator extends DimensBaseListener {
	private HashMap<String, Integer> dimensions;
	
	@Override
	public void exitLine(LineContext ctx){
		String name = ctx.NAME().getText();
		int size = Integer.parseInt(ctx.SIZE().getText());
		dimensions.put(name, size);
	}
	
	/**
	 * @return a map from names of dimens to sizes
	 */
	public HashMap<String, Integer> getDimensions(){
		return dimensions;
	}
	
	/**
	 * @return a sorted list of all possible sizes
	 * TODO: sort
	 */
	public ArrayList<Integer> getAllDimensions(){
		return (ArrayList<Integer>) dimensions.values();
	}
}
