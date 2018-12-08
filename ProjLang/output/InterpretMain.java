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

		
		VarExpr i = new VarExpr("i");
		env = env.addBinding(i.id, new IntVal(-1));

		// Sequence Expression
		AssnExpr assignI = new AssnExpr(i.id, new IntConst(0));
		
		// While Expression
		VarExpr a = new VarExpr("a");
		env = env.addBinding(a.id, new IntVal(0));

		VarExpr b = new VarExpr("b");
		env = env.addBinding(b.id, new IntVal(0));

		AssnExpr assnA = new AssnExpr(a.id, new BinExpr(i, BinOp.PLUS, new IntConst(5)));
		AssnExpr assnB = new AssnExpr(b.id, new BinExpr(a, BinOp.PLUS, new IntConst(2)));
		AssnExpr updateI = new AssnExpr(i.id, new BinExpr(i, BinOp.PLUS, new IntConst(1)));
		
		BinExpr conditionExpression = new BinExpr(i, BinOp.LT, new IntConst(5));
		SeqExpr actionExpression = new SeqExpr(assnA, assnB, updateI);

		WhileExpr whileExpr = new WhileExpr(conditionExpression, actionExpression);

		SeqExpr appExpression = new SeqExpr(assignI, whileExpr);
		Value result = appExpression.eval(env);
		
		Value iValue = env.lookup(i.id);
		Value aValue = env.lookup(a.id);
		Value bValue = env.lookup(b.id);

		System.out.println("A: " + aValue);
		System.out.println("B: " + bValue);
		System.out.println("I: " + iValue);
	}
}
