package lect3.easy;


import java.util.Scanner;

public class TriangleMatrix {
    public static void main(String[] args) {
        int m, n;

        Scanner myRow = new Scanner(System.in);
        System.out.print("Введите количество строк: " );
        m = myRow.nextInt();

        Scanner myColumn = new Scanner(System.in);
        System.out.print("Введите количество столбцов: " );
        n = myColumn.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Исходная матрица");
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println( );
        }

        System.out.println("Нижнетреугольная матрица");
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i <= j) continue;
                else System.out.print(matrix[i][j] + " ");
            }
            System.out.println( );
        }
    }
}
