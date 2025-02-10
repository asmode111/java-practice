package Exam;

public class Planet {
    public static double getSpottingMetric(int[] results) {

        double lowest = 10.0;
        for (int i = 1; i < results.length; i++) {
            double average = 0;
            if (i == results.length - 1) {
                average = getAverage(results[i-1], results[i], 0);
            } else {
                if (results[i] == 0) {
                    average = getAverage(results[i-1], results[i+1], results[i+2]);
                } else if (results[i+1] == 0) {
                    average = getAverage(results[i-1], results[i], results[i+2]);
                } else {
                    average = getAverage(results[i-1], results[i], results[i+1]);
                }
            }

            if (average < lowest) {
                lowest = average;
            }

        }

        return lowest;

    }

    private static double getAverage(int number1, int number2, int number3) {
        return (double) (number1 + number2 + number3) / 3;
    }

    public static void main(String[] args) {
        System.out.println(getSpottingMetric(new int[]{ 2, 1, 3, 0, 1, 5, 0, 0, 6, 7 }));
        System.out.println(getSpottingMetric(new int[]{ 2, 1, 3, 1, 1, 5, 1, 1, 6, 7 }));
    }
}
