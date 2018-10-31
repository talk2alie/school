import java.io.*;
import org.antlr.runtime.*;

public class ParseMain {
    public static void main(String[] args) throws Exception {
        ProjLangLexer lexer = new ProjLangLexer(new ANTLRInputStream(System.in));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProjLangParser parser = new ProjLangParser(tokens);
        parser.input();
    }
}