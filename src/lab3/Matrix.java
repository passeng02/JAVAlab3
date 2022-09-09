package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    static void rowAdd(int[][] a, int[][] b,int m,int n){
        System.out.println("Row major addition : ");
        for(int i = 0; i < m; i++){
            for(int  j = 0 ; j < n; j++){
                System.out.print((a[i][j] + b[i][j]));
                System.out.print(' ');
            }
            System.out.println();
        }

    }
    static void colAdd(int[][] a, int[][] b,int m , int n){
        int[][] c = new int[m][n];
        System.out.println("Column major addition : ");
        for(int  j = 0 ; j < n; j++){
            for(int i = 0; i < m; i++){
                c[i][j] = (a[i][j] + b[i][j]);
            }
        }
        for(int i = 0; i < m; i++){
            for(int  j = 0; j < n; j++) {
                System.out.print((c[i][j]));
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int m,n;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter matrix dimensions(mXn)\n m : ");
        m = in.nextInt();
        System.out.print("n  : ");
        n = in.nextInt();

        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        System.out.println("Enter matrix A : ");
        for(int i = 0; i < m; i++){
            for(int  j = 0; j < n; j++)
                a[i][j] = in.nextInt();
        }
        System.out.println("Enter matrix B : ");
        for(int i = 0; i < m; i++){
            for(int  j = 0; j < n; j++) {
                b[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < m; i++){
            for(int  j = 0; j < n; j++) {
                System.out.print((a[i][j]));
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println("Enter matrix B : ");
        for(int i = 0; i < m; i++){
            for(int  j = 0; j < n; j++) {
                System.out.print((b[i][j]));
                System.out.print(' ');
            }
            System.out.println();
        }

        rowAdd(a,b,m,n);
        colAdd(a,b,m,n);
    }
}
