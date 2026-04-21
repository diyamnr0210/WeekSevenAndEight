public class L1Q15 {
    public static void main(String[] args) {
        int[][] m3x3 = {{1, 2, 3}, {0, 1, 4}, {5, 6, 0}};
        
        System.out.println("Original Matrix:");
        displayMatrix(m3x3);

        System.out.println("Transpose:");
        displayMatrix(findTranspose(m3x3));

        System.out.println("Determinant (3x3): " + findDet3x3(m3x3));
    }

    public static int[][] findTranspose(int[][] m) {
        int r = m.length, c = m[0].length;
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) t[j][i] = m[i][j];
        }
        return t;
    }

    public static int findDet2x2(int[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    public static int findDet3x3(int[][] m) {
        int a = m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]);
        int b = m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]);
        int c = m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
        return a - b + c;
    }

    public static double[][] findInverse2x2(int[][] m) {
        int det = findDet2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double)det;
        inv[0][1] = -m[0][1] / (double)det;
        inv[1][0] = -m[1][0] / (double)det;
        inv[1][1] = m[0][0] / (double)det;
        return inv;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}