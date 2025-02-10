package ObjectOriented.GetterSetter;

public class Main {
    public static void main(String[] args) {

        // Getters and setters protect object data
        // and add rules for accessing or modifying them.

        Car car = new Car("Ford", "Yellow", 20000);

        car.setColor("Black");
        car.setPrice(-34343);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
