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
		// a + b;
		env = env.addBinding("a", new IntVal(10));
		env = env.addBinding("b", new IntVal(17));
		
		VarExpr a = new VarExpr("a");
		VarExpr b = new VarExpr("b");

		BinExpr less = new BinExpr(a, BinOp.LT, b);

		IntConst trueExpression = new IntConst(10);
		IntConst falseExpression = new IntConst(20);
		
		IfExpr ifExpr = new IfExpr(less, trueExpression, falseExpression);

		Value result = ifExpr.eval(env);
		System.out.println(result);
	}
}
