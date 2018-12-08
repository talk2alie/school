public class IfExpr extends Expr {
    public final Expr conditionExpression;
    public final Expr trueExpression;
    public final Expr falseExpression;

    public IfExpr(Expr conditionExpression, Expr trueExpression, Expr falseExpression) {
        this.conditionExpression = conditionExpression;
        this.trueExpression = trueExpression;
        this.falseExpression = falseExpression;
    }

    @Override
    public Value eval(Env e) throws EvalError {
        boolean condition = Boolean.parseBoolean(conditionExpression.eval(e).toString());
        return condition ? trueExpression.eval(e) : falseExpression.eval(e);
    }

    @Override
    public String toString() {
        return conditionExpression.toString() + " " +
               trueExpression.toString() + " " +
               falseExpression.toString();
    }
}