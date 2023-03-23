package OOP_HW.Shapes.AbstractShapes;

public class AbstractRectangle extends AbstractShape{
        private double width;
        private double height;

        public AbstractRectangle(double width, double height)
        {
            this.width = width;
            this.height = height;
        }
        @Override
        public void calculateArea(){
            double area = width*height;
            System.out.println("The area of the rectangle is: " + area);
        }
        @Override
        public void calculatePerimeter(){
            double perimeter = (2*(width+height));
            System.out.println("The perimeter of the rectangle is: " + perimeter);
        }

        public static void main(String[] args) {
            AbstractRectangle rectangle = new AbstractRectangle(8.0,6.0);
            rectangle.calculateArea();
            rectangle.calculatePerimeter();
        }
}
