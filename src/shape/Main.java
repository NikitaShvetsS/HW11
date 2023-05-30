package shape;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(4.5),
                new Triangle(6, 8),
                new Square(7)
        };

        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        System.out.printf("Total area is: " + totalArea);
        //System.out.printf("Total area is: %.2f%n", totalArea);
    }
}