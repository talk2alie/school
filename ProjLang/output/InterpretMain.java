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

		Env env = new EnvImp();

		VarExpr x = new VarExpr("x");
		IntConst two = new IntConst(2);
		IntConst five = new IntConst(50);

		BinExpr inExpression = new BinExpr(x, BinOp.TIMES, five);
		LetValExpr letValExpr = new LetValExpr(x.id, two, inExpression);
		Value value = letValExpr.eval(env);
		System.out.println("Let Val Expr = " + value);
	}
}
