import java.io.*;
import org.antlr.runtime.*;

public class ParseMain {
    public static void main(String args[]) throws Exception {
		//ExprLexer lexer = new ExprLexer(new ANTLRFileStream(args[0]));
		ExprLexer lexer = new ExprLexer(new ANTLRInputStream(System.in));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExprParser parser = new ExprParser(tokens);
		parser.input();
	}
}

