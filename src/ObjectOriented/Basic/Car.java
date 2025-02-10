package ObjectOriented.Basic;

// Basic object example
public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 5088.99;
    boolean isRunning = false;

    void start() {
        System.out.println("You start the engine");
        this.isRunning = true;
    }

    void stop() {
        System.out.println("You stop the engine");
        this.isRunning = false;
    }
}
