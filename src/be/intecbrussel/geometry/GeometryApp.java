package be.intecbrussel.geometry;

public class GeometryApp {


    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle();

        rectangle.setLength(10);
        rectangle.setWidth(15);

        System.out.println(rectangle.getWidth() + " " + rectangle.getLength());


        Square square = new Square();
        square.setLength(10);
        square.setWidth(15);
        square.setSide(99);
        System.out.println(square.getLength() + "  " + square.getWidth());





        System.out.println(square.getArea());
        System.out.println(square.getCircumference());
        System.out.println(square.getLength());
        System.out.println(square.getWidth());



    }
}
