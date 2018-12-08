import java.util.*;

public class SeqExpr extends Expr {
    public final Queue<Expr> expressions = new LinkedList<>();

    public SeqExpr(Expr... expressions) {
        for (Expr expression : expressions) {
            this.expressions.add(expression);
        }
    }

    @Override
    public Value eval(Env e) throws EvalError {
        Value value = null;
        for (Expr expression : expressions) {
            value = expression.eval(e);
        }
        return value;
    }

    @Override
    public String toString() {
        return expressions.toString();
    }
}