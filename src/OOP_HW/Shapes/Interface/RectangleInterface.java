package OOP_HW.Shapes.Interface;

public class RectangleInterface implements Drawable{
    @Override
    public void draw(){
        System.out.println("Draws a rectangle :,)");
    }

    public static void main(String[] args) {
        RectangleInterface rectangle = new RectangleInterface();
        rectangle.draw();
    }
}
