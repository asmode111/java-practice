package ObjectOriented.OverloadedConstructors;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Spongebob");
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println("***************");

        User user2 = new User("Spongebob", "pstart@aol.com");
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
        System.out.println("***************");

        User user3 = new User("Sandy", "sandy@aol.com", 27);
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
        System.out.println("***************");

        User user4 = new User();
        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
        System.out.println("***************");

        User user5 = new User("Degerli", 39);
        System.out.println(user5.username);
        System.out.println(user5.email);
        System.out.println(user5.age);
        System.out.println("***************");
    }
}
