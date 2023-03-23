package OOP_HW.Shapes;

public class Square extends Shape {
    private double side;
    public Square(double side)
    {
        this.side = side;
    }
    @Override
    public void area()
    {
        double area = Math.pow(side,2);
        System.out.println("The area of the square is:" + area);
    }

    public static void main(String[] args) {
        Square square = new Square(4.0);
        square.area();
    }
}
