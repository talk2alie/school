public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) throws Exception {
        if(radius < 0) {
            throw new Exception("Invalid radius");
        }

        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}