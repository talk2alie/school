public class WhileExpr extends Expr {
    public final Expr conditionExpression;
    public final Expr actionExpression;

    public WhileExpr(Expr conditionExpression, Expr actionExpression) {
        this.conditionExpression = conditionExpression;
        this.actionExpression = actionExpression;
    }    

    @Override
    public Value eval(Env e) throws EvalError {
        boolean condition = evaluateBoolean(conditionExpression, e);
        while(condition) {
            value = actionExpression.eval(e);
            condition = evaluateBoolean(conditionExpression, e);
        }
        return new BoolVal(false);
    }

    private boolean evaluateBoolean(Expr expression, Env e) throws EvalError {
        return Boolean.parseBoolean(conditionExpression.eval(e).toString());
    }

    @Override
    public String toString() {
        return null;
    }
}