package OOP_HW.Shapes.Interface;

public class CircleInterface implements Drawable{
    @Override
    public void draw(){
        System.out.println("Draws a circle :,)");
    }

    public static void main(String[] args) {
        CircleInterface circle = new CircleInterface();
        circle.draw();    }
}
