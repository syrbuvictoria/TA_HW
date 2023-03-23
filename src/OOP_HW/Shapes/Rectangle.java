package OOP_HW.Shapes;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    @Override
    public void area(){
        double area = width*height;
        System.out.println("The area of the rectangle is: " + area);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0,6.0);
        rectangle.area();
    }
}
