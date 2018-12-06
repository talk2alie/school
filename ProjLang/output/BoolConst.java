public class BoolConst extends Expr  {
    public final boolean value;

    public BoolConst(boolean value) {
        this.value = value;
    }

    public Value eval(Env e) throws EvalError {
        return new BoolVal(value);
    }

    public String toString() {
        return String.valueOf(value);
    }
}