public class DivideExpr extends Expr {
    private final Expr left;
    private final Expr right;

    public DivideExpr(Expr left, Expr right) {
        this.left = left;
        this.right = right;
    }

    public int eval() {
        return left.eval() / right.eval();
    }
}