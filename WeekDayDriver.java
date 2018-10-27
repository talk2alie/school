public class WeekDayDriver {
    public static void main(String[] args) {
        Coin coin = Coin.Dime;
        String color = coin.color();
        double value = coin.value();
        System.out.println(String.format("Color: %s, Value: %.2f", color, value));
    }
}