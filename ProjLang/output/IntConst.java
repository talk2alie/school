public class IntConst extends Expr {
    public final int value;

    public IntConst(int value) {
        this.value = value;
    }

    public Value eval(Env e) throws EvalError {
        return new IntVal(value);
    }

    public String toString() {
        return String.valueOf(value);
    }
}
