public class LetFunExpr extends Expr {
    public final String paramId;
    public final Expr bindingExpr;
    public final Expr inExpr;

    public LetFunExpr(String paramId, Expr bindingExpr, Expr inExpr) {
        this.paramId = paramId;
        this.bindingExpr = bindingExpr;
        this.inExpr = inExpr;
    }

    @Override
    public Value eval(Env e) throws EvalError {
        Value paramValue = bindingExpr.eval(e);
        e = e.addBinding(paramId, paramValue);

        return inExpr.eval(e);
    }    

    @Override
    public String toString() {
        return paramId + " " +
               bindingExpr.toString() + " " +
               inExpr.toString();
    }
}