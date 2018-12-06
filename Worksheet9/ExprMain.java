public class ExprMain {
    public static void main(String[] args) {
        Expr one = new NumExpr(1);
        Expr two = new NumExpr(2);
        Expr three = new NumExpr(3);

        Expr times = new TimesExpr(two, three);
        Expr plus = new PlusExpr(one, times);
        

        System.out.println(plus.eval());
    }
}