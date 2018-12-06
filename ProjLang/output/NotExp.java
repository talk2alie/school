public class NotExp extends Expr {
  public final Expr expression;

  public NotExp(Expr expression) {
    this.expression = expression;
  }

  public Value eval(Env e) throws EvalError {
    Value value = expression.eval(e);
    if (value instanceof BoolVal)
      return new BoolVal(!((BoolVal) value).value);
    else
      throw new EvalError("Evaluation error: Incompatible arg types");
  }

  public String toString() {
    return "!" + expression.toString();
  }
}
