public class IntVal extends Value {
    public final int value;

    public IntVal(int value) {
        this.value = value;
    }

    public String toString() {
        return String.valueOf(value);
    }
}
