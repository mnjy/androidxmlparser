import colors.*;
import dimens.*;
import styles.*;
import styles.StylesListenerCreator.Text;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class XmlParser {
	private HashMap<String, Integer> dimensions;
	private HashMap<String, String> colors;
	private HashSet<String> fonts;
	private HashMap<String, Text> texts; //TODO: make a data structure for this that will make searching easy

	/**
	 * @param dimensfile the path of the dimens.xml file to parse
	 * @param colorsfile the path of the colors.xml file to parse
	 * @param stylesfile the path of the styles.xml file to parse
	 * 
	 * @throws FileNotFoundException if a file cannot be found or opened 
	 * @throws IOException if a network error occurs
	 */
	public XmlParser(String dimensfile, String colorsfile, String stylesfile) {
		try {
			dimensions = parseDimensFile(dimensfile);
			colors = parseColorsFile(colorsfile);
			fonts = parseStylesFile(stylesfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * @param dimensfile the path of the dimens.xml file to parse
	 * @throws FileNotFoundException if file cannot be found or opened 
	 * @throws IOException if a network error occurs
	 */
	private HashMap<String, Integer> parseDimensFile(String dimensfile) throws FileNotFoundException, IOException {
		String filepath = getResourcePath(dimensfile);
		FileReader boardfileReader = new FileReader(filepath);

		//Create tree
		CharStream stream = new ANTLRInputStream(boardfileReader);
		DimensLexer lexer = new DimensLexer(stream);
		TokenStream tokens = new CommonTokenStream(lexer);
		DimensParser parser = new DimensParser(tokens);
		ParseTree tree = parser.root();

		//Walk tree
		ParseTreeWalker walker = new ParseTreeWalker();
		DimensListenerCreator dimens_listener = new DimensListenerCreator();
		walker.walk(dimens_listener, tree);
		HashMap<String, Integer> dimensions = dimens_listener.getDimensions();

		//Return dimensions
		return dimensions;
	}
	
	/**
	 * @param colorsfile the path of the colors.xml file to parse
	 * @throws FileNotFoundException if file cannot be found or opened 
	 * @throws IOException if a network error occurs
	 */
	private HashMap<String, String> parseColorsFile(String colorsfile) throws FileNotFoundException, IOException {
		String filepath = getResourcePath(colorsfile);
		FileReader boardfileReader = new FileReader(filepath);

		//Create tree
		CharStream stream = new ANTLRInputStream(boardfileReader);
		DimensLexer lexer = new DimensLexer(stream);
		TokenStream tokens = new CommonTokenStream(lexer);
		DimensParser parser = new DimensParser(tokens);
		ParseTree tree = parser.root();

		//Walk tree
		ParseTreeWalker walker = new ParseTreeWalker();
		ColorsListenerCreator colors_listener = new ColorsListenerCreator();
		walker.walk(colors_listener, tree);
		HashMap<String, String> colors = colors_listener.getColors();

		//Return colors
		return colors;
	}
	
	/**
	 * @param stylesfile the path of the styles.xml file to parse
	 * @throws FileNotFoundException if file cannot be found or opened 
	 * @throws IOException if a network error occurs
	 */
	private HashSet<String> parseStylesFile(String stylesfile) throws FileNotFoundException, IOException {
		String filepath = getResourcePath(stylesfile);
		FileReader boardfileReader = new FileReader(filepath);

		//Create tree
		CharStream stream = new ANTLRInputStream(boardfileReader);
		DimensLexer lexer = new DimensLexer(stream);
		TokenStream tokens = new CommonTokenStream(lexer);
		DimensParser parser = new DimensParser(tokens);
		ParseTree tree = parser.root();
		
		//Walk tree
		ParseTreeWalker walker = new ParseTreeWalker();
		StylesListenerCreator styles_listener = new StylesListenerCreator();
		walker.walk(styles_listener, tree);
		HashSet<String> fonts = styles_listener.getFonts();
		HashMap<String, Text> texts = styles_listener.getTexts();
		
		//Set texts
		this.texts = texts;
		
		//Return fonts
		return fonts;
	}

	/**
	 * Return the absolute path of the specified file resource on the classpath.
	 * @throws IOException if a valid path to an existing file cannot be returned
	 */
	private static String getResourcePath(String fileName) throws IOException {
		URL url = Thread.currentThread().getContextClassLoader().getResource(fileName);
		if (url == null) {
			//This might be an absolute filename 
			File file = new File(fileName); 
			if (file.isFile()){
				return file.getAbsolutePath();
			}
			else{
				throw new IOException("Failed to locate resource " + fileName);
			}
		}
		File file;
		try {
			file = new File(url.toURI());
		} catch (URISyntaxException urise) {
			throw new IOException("Invalid URL: " + urise);
		}

		String path = file.getAbsolutePath();
		if ( ! file.exists()) {
			throw new IOException("File " + path + " does not exist");
		}
		return path;
	}
}
