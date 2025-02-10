package ObjectOriented.Basic;

public class Main {
    public static void main(String[] args) {
        initiateCar();
        initiateStudent();
    }

    private static void initiateStudent() {
        Student student1 = new Student("Spongebob", 30, 3.2);
        Student student2 = new Student("Patric", 34, 1.5);
        Student student3 = new Student("Sandy", 27, 4.0);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.study();
    }

    private static void initiateCar() {
        Car car = new Car();

        System.out.println(car.model);
        System.out.println(car.make);

        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
    }
}
