package ObjectOriented.Polymorphism.RuntimePolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Runtime(Dynamic) Polymorphism: When the method that gets executed is decided
        // at runtime based on the actual type of the object

        Scanner scanner = new Scanner(System.in);

        Animal animal;
        int choice;

        System.out.print("Would you like a dog(1) or cat(2)? ");
        choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }

    }
}
