public class VarExpr extends Expr {
    public final String id;

    public VarExpr(String id) {
        this.id = id;
    }

    @Override
    public Value eval(Env e) throws EvalError {
        Value val = e.lookup(id);
        return val;
    }

    @Override
    public String toString() {
        return id;
    }
}