public class NumExpr implements Expr {
    private final int value;

    public NumExpr(int value) {
        this.value = value;
    }

    public int eval() {
        return value;
    }
}