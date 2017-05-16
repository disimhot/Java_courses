package lect3.easy;


import java.util.Scanner;

public class Adjunct {
    public static void main(String[] args) {
        Matrix matrixA = new Matrix(9, 9);
        int array[][] = matrixA.getMatrix();

        int row, col;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите номер строки для удаления ");
        row = myScanner.nextInt();
        System.out.println("Введите номер столбца для удаления ");
        col = myScanner.nextInt();

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[1].length; j++){
                System.out.print(array[i][j] + " ");
                }
                System.out.println( );
            }


        System.out.println("New matrix");
        for(int i = 0; i < array.length; i++){
            if(i == (row-1)) continue;
            else {for (int j = 0; j < array[1].length; j++){
                if (j == (col-1)) continue;
                else {
                    System.out.print(array[i][j] + " ");
                }
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
            matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    this.matrix[i][j] = (int) (Math.random() * 100);
                }
            }
        }
    }
}

