package ObjectOriented.Intefaces;

public class Main {
    public static void main(String[] args) {
        // Interface is a blueprint for a class that specifies a set of abstract methods.
        // that implementing classes must define.
        // Supports multiple inheritance-like behavior.

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        hawk.hunt();
        rabbit.flee();
        fish.hunt();
        fish.flee();
    }
}
