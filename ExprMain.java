public class ExprMain {
    public static void main(String[] args) {
        Expr one = new NumExpr(1);
        Expr two = new NumExpr(2);
        Expr three = new NumExpr(3);

        Expr plus = new PlusExpr(one, two);
        Expr times = new TimesExpr(plus, three);

        System.out.println(times.eval());
    }
}