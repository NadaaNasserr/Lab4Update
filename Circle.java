public class Circle extends Shape{


    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double circleArea = Math.PI * Math.pow(radius,2);

        return circleArea;
    }

    @Override
    public double calculateCircumference() {
        double circleCircumference = 2 * Math.PI * radius;

       return circleCircumference;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
