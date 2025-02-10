package ObjectOriented.Abstraction;

public class Main {
    public static void main(String[] args) {
        // abstract is used to define abstract classes and methods
        // Abstraction is the process of hiding implementation details
        // and showing only the essential features:
        // Abstract classes cannot be instantiated directly.
        // Can contain abstract methods(which must be implemented)
        // Can contain concrete methods(which are inherited)

        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(3, 5);
        Rectangle rectangle  = new Rectangle(4, 5);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
