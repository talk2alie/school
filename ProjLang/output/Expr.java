public abstract class Expr {
    public abstract Value eval(Env e) throws EvalError;

    public abstract String toString();
}
