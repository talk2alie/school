import java.io.*;
import org.antlr.runtime.*;

public class Scanner {
    public static void main(String[] args) {
        ProjectLexer lexer = new ProjectLexer(new ANTLRInputStream(System.in));
        Token token = lexer.nextToken();
        while (token.getType() != Token.EOF) {
            System.out.println("Lexeme = " + token.getText() + " Token = " + token.getType());
            token = lexer.nextToken();
        }
    }
}