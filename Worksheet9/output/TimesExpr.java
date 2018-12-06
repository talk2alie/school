public class TimesExpr extends Expr {
    private final Expr left;
    private final Expr right;

    public TimesExpr(Expr left, Expr right) {
        this.left = left;
        this.right = right;
    }

    public int eval() {
        return left.eval() * right.eval();
    }
}