public class LetValExpr extends Expr {
    public final String id;
    public final Expr bindingExpression;
    public final Expr inExpression;

    public LetValExpr(String id, Expr bindingExpression, Expr inExpression) {
        this.id = id;
        this.bindingExpression = bindingExpression;
        this.inExpression = inExpression;
    }

    @Override
    public Value eval(Env e) throws EvalError {
        e = e.addBinding(id, bindingExpression.eval(e));
        Value result = inExpression.eval(e);
        return result;
    }

    @Override
    public String toString() {
        return id + " " + 
               bindingExpression.toString() + " " +
               inExpression.toString();
    }
}