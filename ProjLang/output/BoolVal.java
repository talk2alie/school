public class BoolVal extends Value {
    public final boolean value;
    
    public BoolVal(boolean value) {
        this.value = value;
    }

    public String toString() {
        return String.valueOf(value);
    }
}