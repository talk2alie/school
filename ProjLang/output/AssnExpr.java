public class AssnExpr extends Expr{
    public final String id;
    public final Value value;

    public AssnExpr(String id, Value value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public Value eval(Env e) throws EvalError {
        e = e.updateBinding(id, value);
        return value;
    }

    @Override
    public String toString() {
        return id + " " + value.toString();
    }
}