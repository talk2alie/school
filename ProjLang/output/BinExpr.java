public class BinExpr extends Expr {
    public final Expr left;
    public final Expr right;
    private final BinOp operation;

    public BinExpr(Expr left, BinOp operation, Expr right) {
        this.left = left;
        this.operation = operation;
        this.right = right;
    }

    // I do not like this implementation because it violates the OCP.
    // In the future, I will modify it to be better
    public Value eval(Env e) throws EvalError {
        switch (operation) {
            case AND:
                    boolean andLeft = Boolean.parseBoolean(left.eval(e).toString());
                    boolean andRight = Boolean.parseBoolean(right.eval(e).toString());
                    return new BoolVal(andLeft && andRight);
            case DIV:
                    int divLeft = Integer.parseInt(left.eval(e).toString());
                    int divRight = Integer.parseInt(right.eval(e).toString());
                    return new IntVal(divLeft - divRight);
            case EQ:
                    String eqLeft = left.eval(e).toString();
                    String eqRight = right.eval(e).toString();
                    return new BoolVal(eqLeft.equals(eqRight));
            case LT:
                    int ltLeft = Integer.parseInt(left.eval(e).toString());
                    int ltRight = Integer.parseInt(right.eval(e).toString());
                    return new BoolVal(ltLeft < ltRight);
            case MINUS:
                    int minusLeft = Integer.parseInt(left.eval(e).toString());
                    int minusRight = Integer.parseInt(right.eval(e).toString());
                    return new IntVal(minusLeft - minusRight);
            case OR:
                    boolean orLeft = Boolean.parseBoolean(left.eval(e).toString());
                    boolean orRight = Boolean.parseBoolean(right.eval(e).toString());
                    return new BoolVal(orLeft || orRight);
            case PLUS:
                    int plusLeft = Integer.parseInt(left.eval(e).toString());
                    int plusRight = Integer.parseInt(right.eval(e).toString());
                    return new IntVal(plusLeft + plusRight);
            case TIMES:
                    int timesLeft = Integer.parseInt(left.eval(e).toString());
                    int timesRight = Integer.parseInt(right.eval(e).toString());
                    return new IntVal(timesLeft + timesRight);
            default:
                throw new EvalError("Operation is invalid");
        }
    }

    public String toString() {
        return left.toString() + " " + right.toString();
    }
}