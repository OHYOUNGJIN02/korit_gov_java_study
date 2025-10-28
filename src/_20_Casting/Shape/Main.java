package _20_Casting.Shape;

/*
*
* */
public class Main {
    public static void main(String[] args) {
        double total = 0;


        Circle circle = new Circle(3);
        circle.render();
        System.out.println(circle.area());

        Rectangle rectangle = new Rectangle(5, 8);
        rectangle.render();
        System.out.println(rectangle.area());
    }



    Shape[] shapes = new Shape[2];






}
