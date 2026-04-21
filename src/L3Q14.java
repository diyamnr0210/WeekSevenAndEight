public class L1Q14 {
    public static void main(String[] args) {
        int[][] matA = createRandomMatrix(3, 3);
        int[][] matB = createRandomMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(matA);
        System.out.println("Matrix B:");
        displayMatrix(matB);

        System.out.println("Addition Result:");
        displayMatrix(addMatrices(matA, matB));

        System.out.println("Subtraction Result:");
        displayMatrix(subtractMatrices(matA, matB));

        System.out.println("Multiplication Result:");
        displayMatrix(multiplyMatrices(matA, matB));
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) result[i][j] = a[i][j] + b[i][j];
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) result[i][j] = a[i][j] - b[i][j];
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int r1 = a.length, c1 = a[0].length, c2 = b[0].length;
        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
        System.out.println();
    }
}