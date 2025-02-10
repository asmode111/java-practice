package ThreadingExamples.MultiThreading;

public class Main {
    public static void main(String[] args) {
        // MultiThreading enables a program to run multiple threads concurrently
        // Thread = A set of instructions that run independently
        // Useful for background tasks or time-consuming operations

        Thread thread1 = new Thread(new MyRunnable("Ping"));
        Thread thread2 = new Thread(new MyRunnable("Pong"));

        System.out.println("Game start");
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }

        System.out.println("Game over");
    }
}
