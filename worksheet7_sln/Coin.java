// Worksheet 7, Question 4

public enum Coin {
    Penny("Copper", 1),
    Dime("Silver", 10),
    Nickel("Silver", 5),
    Quarter("Silver", 25);

    private final String color;
    private final int value;

    Coin(String color, int value) {
        this.color = color;
        this.value = value;
    }

    double value() {
        return value / 100.0;
    }

    String color() {
        return color;
    }
}