public class VarargsExamples {
    public static void main(String[] args) {
        // varargs allows a method to accept a varying # of arguments
        // makes methods more flexible.
        // noo need for overloaded methods
        // java will pack the arguments into an array
        // ... (ellipsis)

        int sum = add(1, 2, 3, 4, 5, 6);
        System.out.println(sum);
        double average = average(1, 2, 3, 4, 5, 6, 6);
        System.out.printf("%.2f\n", average);
        average = average();
        System.out.printf("%.2f\n", average);
    }

    private static int add(int... numbers) {
        int sum = 0;

        for (int number: numbers) {
            sum += number;
        }

        return sum;
    }

    private static double average(double... numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        double sum = 0;

        for (double number: numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }
}
