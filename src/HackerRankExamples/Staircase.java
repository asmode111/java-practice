package HackerRankExamples;

public class Staircase {
    public static void main(String[] args) {
        int n = 6;

        staircase(n);
    }

    private static void staircase(int n) {
        int space = n-1;
        int hash = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(space));
            System.out.print("#".repeat(hash));
            space--;
            hash++;

            System.out.print("\n");
        }
    }
}
