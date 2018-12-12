public class AppExpr extends Expr {
    public final String paramName;
    public final Expr paramExpr;
    public final Expr functionExpr;

    public AppExpr(String paramName, Expr paramExpr, Expr functionExpr) {
        this.paramName = paramName;
        this.paramExpr = paramExpr;
        this.functionExpr = functionExpr;
    }

    @Override
    public Value eval(Env e) throws EvalError {
        Value paramValue = paramExpr.eval(e);
        e = e.addBinding(paramName, paramValue);

        return functionExpr.eval(e);
    }

    @Override
    public String toString() {
        return paramName + " " +
               paramExpr.toString() + " " +
               functionExpr.toString;
    }
}