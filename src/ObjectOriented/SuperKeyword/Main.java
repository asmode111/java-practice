package ObjectOriented.SuperKeyword;

public class Main {
    public static void main(String[] args) {
        // super refers to the parent class (subclass <- superclass)
        // used in constructors and method overriding
        // Calls the parent constructor to initialize attributes

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 3.2);
        Employee employee = new Employee("Ali", "Veli", 34343);

        person.showName();
        student.showName();
        student.showGPA();
        employee.showSalary();
    }
}
