public class P6_MaxPathSum {

    public static int maxSum(int[][] matrix) {

        int maxSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int x = 0, y = i, diagonalSum = 0;

            for (int j = i; j < matrix.length; j++) {
                diagonalSum += matrix[x][y];
                x++;
                y++;
            }
            if (diagonalSum > maxSum) maxSum = diagonalSum;

        }
        for (int i = 1; i < matrix.length; i++) {
            int y = 0, x = i, diagonalSum = 0;
            for (int k = i; k < matrix.length; k++) {
                diagonalSum+= matrix[x][y];
                x++;
                y++;
            }
            if (diagonalSum > maxSum) maxSum = diagonalSum;
        }

        return maxSum;
    }


}
