import org.antlr.runtime.*;

public class InterpretMain {
	public static void main(String[] args) throws Exception {
		// System.setErr(System.out);
		// ANTLRInputStream input = new ANTLRInputStream(System.in);
		// ProjLangLexer lexer = new ProjLangLexer(input);
		// CommonTokenStream tokens = new CommonTokenStream(lexer);
		// ProjLangParser parser = new ProjLangParser(tokens);
		// try {
		// 	Expr e = parser.input();
		// 	Env emptyEnv = new EnvImp();
		// 	System.out.println(e.eval(emptyEnv));
		// } catch (Exception e) {
		// 	System.out.println(e.getMessage());
		// }
		IntConst left = new IntConst(0);
		IntConst right = new IntConst(0);
		BinExpr expression = new BinExpr(left, BinOp.OR, right);
		Env emptyEnv = new EnvImp();
		Value result = expression.eval(emptyEnv);
		System.out.println(result);
	}
}
