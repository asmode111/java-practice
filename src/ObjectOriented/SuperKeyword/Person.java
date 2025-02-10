package ObjectOriented.SuperKeyword;

public class Person {

    String first;
    String last;
    String test = "test";

    Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    void showName() {
        System.out.println(this.first + " " + this.last);
    }
}
