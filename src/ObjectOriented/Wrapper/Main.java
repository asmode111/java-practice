package ObjectOriented.Wrapper;

public class Main {
    public static void main(String[] args) {
        // Wrapper classes allow primitive values (int, char, double, boolean)
        // to be used as objects. "Wrap them in an object"
        // Generally, don't wrap primitives unless you need an object
        // Allows use of Collections Framework and static Utility Methods.

        useWrapperClasses();
        useAutoboxingUnboxing();
        convertPrimitiveDataIntoString();
        checkUtilityMethodsAKAParsing();
        checkIsLetter();
    }

    private static void checkIsLetter() {
        char letter = 'b';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
        System.out.println(Character.isLowerCase(letter));

        char letter2 = '$';
        System.out.println(Character.isLetter(letter2));

    }

    private static void checkUtilityMethodsAKAParsing() {
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");

        System.out.println(a + " " + b + " " + c + " " + d);
    }

    private static void convertPrimitiveDataIntoString() {
        String x = Integer.toString(123);
        String y = Double.toString(3.14);
        String z = Character.toString('@');
        String t = Boolean.toString(false);

        System.out.println(x + " " + y + " " + z + " " + t);
    }

    private static void useAutoboxingUnboxing() {
        // Autoboxing
        Integer a2 = 123;
        Double b2 = 3.14;
        Character c2 = '$';
        Boolean d2 = true;

        System.out.println(a2 + " " + b2 + " " + c2 + " " + d2);

        // Unboxing
        int a3 = a2;
        double b3 = b2;
        char c3 = c2;
        boolean d3 = d2;

        System.out.println(a3 + " " + b3 + " " + c3 + " " + d3);
    }

    private static void useWrapperClasses() {
        Integer a = new Integer(123);
        Double b = new Double(34.34);
        Character c = new Character('$');
        Boolean d = new Boolean(true);

        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
