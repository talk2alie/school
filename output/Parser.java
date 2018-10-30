import java.io.*;
import org.antlr.runtime.*;

public class Parser {
    public static void main(String args[]) throws Exception {
        ProjectLexer lexer = new ProjectLexer(new ANTLRInputStream(System.in));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProjectParser parser = new ProjectParser(tokens);
        parser.input();
    }
}