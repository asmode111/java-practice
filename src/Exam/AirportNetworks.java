package Exam;

public class AirportNetworks {
    public static int getCount(boolean[][] matrix) {

        int newConnections = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 2; j < matrix[i].length; j++) {
                if (!matrix[i][j]) {
                    newConnections++;
                }
            }
        }

        return newConnections;
    }

    public static void main(String[] args) {
        boolean[][] matrix = {
                {false, true, false, false, false},
                {true, false, false, false, false},
                {false, false, false, true, false},
                {false, false, true, false, false},
                {false, false, false, false, false}
        };
        System.out.println(getCount(matrix)); // should print 6
    }
}
