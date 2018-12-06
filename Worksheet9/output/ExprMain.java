import java.io.*;
import org.antlr.runtime.*;

public class ExprMain {
    public static void main(String[] args) throws IOException {
        System.setErr(System.out);
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        try {
            Expr e = parser.input();
            System.out.println(e.eval());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}