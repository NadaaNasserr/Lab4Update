
public class Main {
    public static void main(String[] args) {



        Rectangle r1 = new Rectangle(3,8);
        System.out.println("Calculate area and circumference of rectangle");
        System.out.println("calculate circumference of Rectangle:  " + "(2 x " + r1.getHeight() + ") + " + "(2 x " + r1.getWidth() +") = " + r1.calculateCircumference());
        System.out.println("calculate Area of Rectangle:  " + r1.getHeight() + " x " + r1.getWidth() +" = " + r1.calculateArea());
        System.out.println("Length and Weight of the " + r1.toString());


        Circle c1 = new Circle(9);
        System.out.println("Calculate area and circumference of circle");
        System.out.println("calculate Area of Circle:  " + "PI * " + c1.getRadius() + " x " + c1.getRadius() +  " = " + c1.calculateArea());
        System.out.println("calculate circumference of Circle: " + "2 x PI x " + c1.getRadius() + " = "+ c1.calculateCircumference());
        System.out.println("Radius of the " + c1.toString());


        Triangle t1 = new Triangle(8,6);
        System.out.println("Calculate area and circumference of triangle");
        System.out.println("calculate Area of Triangle:  " + t1.getBase() + " x " + t1.getHeight() + " /2  = " + t1.calculateArea());
        System.out.println("calculate circumference of Triangle: "  + "(2 x " + t1.getHeight() + ")" + " + " + t1.getBase() + " = "+ t1.calculateCircumference());
        System.out.println("Height and Base of the " + t1.toString());

        Triangle t2 = new Triangle(6,6);
        System.out.println(t2.calculateArea());
        System.out.println(t2.calculateCircumference());
    }
}