public class VarExpr extends Expr {
    public final String id;

    public VarExpr(String id) {
        this.id = id;
    }

    @Override
    public Value eval(Env e) throws EvalError {
        return e.lookup(id);
    }

    @Override
    public String toString() {
        return id;
    }
}