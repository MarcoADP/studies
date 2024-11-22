package crackingcodeinterview.ch1;

public class ZeroMatrix {

    private ZeroMatrix() { }

    public static int[][] zeroMatrixWithoutAux(int[][] matrix) {

        boolean firstRowZero = checkFirstRowZero(matrix[0]);
        boolean firstColumnZero = checkFirstColumnZero(matrix);
        checkMatrixRemainder(matrix);

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                replaceRowWithZero(matrix, i);
            }
        }

        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                replaceColumnWithZero(matrix, j);
            }
        }

        if (firstRowZero) {
            replaceRowWithZero(matrix, 0);
        }

        if (firstColumnZero) {
            replaceColumnWithZero(matrix, 0);
        }

        return matrix;

    }

    private static void checkMatrixRemainder(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
    }

    private static boolean checkFirstRowZero(int[] firstRow) {
        for (int j = 0; j < firstRow.length; j++) {
            if (firstRow[j] == 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkFirstColumnZero(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                return true;
            }
        }
        return false;
    }

    public static int[][] zeroMatrix(int[][] matrix) {

        boolean[] rowsWithZero = new boolean[matrix.length];
        boolean[] columnsWithZero = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowsWithZero[i] = true;
                    columnsWithZero[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (rowsWithZero[i]) {
                replaceRowWithZero(matrix, i);
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            if (columnsWithZero[j]) {
                replaceColumnWithZero(matrix, j);
            }
        }

        return matrix;

    }

    private static void replaceRowWithZero(int[][] matrix, int i) {
        for(int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = 0;
        }
    }

    private static void replaceColumnWithZero(int[][] matrix, int j) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][j] = 0;
        }
    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%s ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }

}
