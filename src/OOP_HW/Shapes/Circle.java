package OOP_HW.Shapes;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    @Override
    public void area()
    {
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("The area of the circle is:" + area);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(8.0);
        circle.area();
    }
}
