package ObjectOriented.Composition;

public class Main {
    public static void main(String[] args) {
        // Composition represents a "part of" relationship between objects.
        // For example, an Engine is a part of a Car.
        // Allows complex objects to be constructed from smaller objects.

        Car car = new Car("BMW", 2027, "VB");

        System.out.println(car.engine.type);

        car.start();
    }
}
