package lect3.easy;


import java.util.Arrays;
import java.util.Scanner;

public class AlgAdjunct {
    public static void main(String[] args) {
        Matrix matrixA = new Matrix(9, 9);
        int array[][] = matrixA.getMatrix();

        System.out.println("Исходная матрица");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int line, column;
        Scanner myLine = new Scanner(System.in);
        System.out.println("Введите номер строки для удаления из матрицы: ");
        line = myLine.nextInt();

        Scanner myColumn = new Scanner(System.in);
        System.out.println("Введите номер столбца для удаления из матрицы: ");
        column = myColumn.nextInt();


        System.out.println("Алгебраическое дополнение");
        for(int i = 0; i < array.length; i++) {
            if(i == (line - 1)) continue;
            else {
                for (int j = 0; j < array.length; j++) {
                    if (j == (column - 1)) continue;
                    else System.out.print(array[i][j] + " ");
                }
            }
            System.out.println( );
        }
    }

    public static class Matrix {
        int m, n;
        int matrix[][];// = new int[m][n];

        public int[][] getMatrix() {
            return matrix;
        }

        public Matrix(int m, int n) {
            this.m = m;
            this.n = n;
            matrix= new int[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    this.matrix[i][j] = (int)(Math.random() * 100);
                }
            }
        }
    }
}