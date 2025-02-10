package ObjectOriented.Intefaces;

public class Fish implements Prey, Predator {

    @Override
    public void flee() {
        System.out.println("Fish is swimming away.");
    }

    @Override
    public void hunt() {
        System.out.println("Fish is hunting.");
    }
}
