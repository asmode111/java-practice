package ObjectOriented.SuperKeyword;

public class Employee extends Person {

    int salary;

    Employee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    void showSalary() {
        super.showName();
        System.out.println(super.test);
        System.out.println(this.first + " " + this.last + " salary is " + this.salary);
    }
}
