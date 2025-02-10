package ObjectOriented.Polymorphism.WithInterface;

public class Bike implements Vehicle {

    @Override
    public void go() {
        System.out.println("You ride the bike");
    }
}
