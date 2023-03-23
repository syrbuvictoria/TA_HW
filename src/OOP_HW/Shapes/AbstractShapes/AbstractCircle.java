package OOP_HW.Shapes.AbstractShapes;

public class AbstractCircle extends AbstractShape{
    private double radius;

    public AbstractCircle(double radius)
    {
        this.radius = radius;
    }
    @Override
    public void calculateArea(){
        double Area = Math.PI * Math.pow(radius,2);
        System.out.println("The area of the circle is: " + Area);
    }
    @Override
    public void calculatePerimeter(){}

    public static void main(String[] args) {
        AbstractCircle circle = new AbstractCircle(5.0);
        circle.calculateArea();
    }
}
