package OOP_HW.Shapes;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() {
        double area = (base * height) / 2;
        System.out.println("The area of the triangle is:" + area);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(8.0,9.0);
        triangle.area();
    }
}
