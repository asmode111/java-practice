package ObjectOriented.MethodOverriding;

public class Fish extends Animal {

    @Override
    void move() {
        System.out.println("This animal is swimming");
    }
}
