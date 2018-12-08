public class AssnExpr extends Expr{
    public final String id;
    public final Expr valueExpression;

    public AssnExpr(String id, Expr valueExpression) {
        this.id = id;
        this.valueExpression = valueExpression;
    }

    @Override
    public Value eval(Env e) throws EvalError {
        Value value = valueExpression.eval(e);
        e = e.updateBinding(id, value);
        return value;
    }

    @Override
    public String toString() {
        return id + " " + valueExpression.toString();
    }
}