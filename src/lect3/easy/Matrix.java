package lect3.easy;

import java.util.Arrays;

public class Matrix {
        int m, n;
        int matrix[][] = new int[m][n];

    public int[][] getMatrix() {
        return matrix;
    }

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = (int)(Math.random() * 100);
            }
        }
    }
}

 class AlgebraicAdjunct {
    public static void main(String[] args) {
        Matrix matrixA = new Matrix(9, 9);

        int array[][] = matrixA.getMatrix();
        System.out.println(array);
    }
}

