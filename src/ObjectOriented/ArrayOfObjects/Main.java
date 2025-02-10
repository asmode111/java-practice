package ObjectOriented.ArrayOfObjects;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        System.out.println("*******************");

        Car[] cars = new Car[3];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;

        for (Car carObject: cars) {
            carObject.drive();
        }

        System.out.println("*******************");

        Car[] cars2 = { car1, car2, car3 };
        for (int i = 0; i < cars2.length; i++) {
            cars[i].drive();
        }

        System.out.println("*******************");
    }
}
