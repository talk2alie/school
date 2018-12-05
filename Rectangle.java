public class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) throws Exception {
        if (width < 0 || height < 0) {
            throw new Exception("Invalid dimension");
        }

        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}