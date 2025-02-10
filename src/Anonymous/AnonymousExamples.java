package Anonymous;

public class AnonymousExamples {
    public static void main(String[] args) {
        // Anonymous class is a class that does not have a name. Cannot be reused.
        // Add custom behaviour without having to create a new class.
        // Ofter used for one time uses like TimerTask, Runnable, callbacks.

        Dog dog = new Dog();
        Dog dog2 = new Dog() {
            @Override
            void speak() {
                System.out.println("roh roh");
            }
        };

        dog.speak();
        dog2.speak();
    }
}
