package ObjectOriented.Abstraction;

public abstract class Shape {

    // abstract method
    abstract double area();

    // concrete method
    // cannot be overridden but inherited.
    void display() {
        System.out.println("This is a shape");
    }
}
