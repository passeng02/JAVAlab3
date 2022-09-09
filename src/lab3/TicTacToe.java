package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    static boolean checkWin(int turn, char[][] board,int[][] row,int[][] col,int[][] dia){
        for(int i  = 0; i < 3; i++){
            if(row[turn-1][i] == 3){
                System.out.println("Player " + turn + " wins. Game Over.");
                return true;
            }
        }

        for(int i  = 0; i < 3; i++){
            if(col[turn-1][i] == 3){
                System.out.println("Player " + turn + " wins. Game Over.");
                return true;
            }
        }

        for(int i  = 0; i < 2; i++){
            if(dia[turn-1][i] == 3){
                System.out.println("Player " + turn + " wins. Game Over.");
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        char[][] board = new char[3][3];
        Scanner in = new Scanner(System.in);
        int[][] row = new int[2][3];
        int[][] col = new int[2][3];
        int[][] dia = new int[2][2];
        int turn = 1;
        boolean aWin = false;
        for(int i = 0;  i < 3; i++)
            Arrays.fill(board[i],'b');
        for(int i = 0; i < 2; i++) {
            Arrays.fill(row[i], 0);
            Arrays.fill(col[i], 0);
            Arrays.fill(dia[i], 0);
        }
        int m,n;
        for(int i = 0; i < 9; i++){
            if(turn  == 1)
            {
                System.out.println("Player 1(X) \nEnter position : ");
                m = in.nextInt();
                n = in.nextInt();

                board[m][n] = 'X';
                row[0][m]++;
                col[0][n]++;
                if(m == n)
                    dia[0][0]++;
                if(m + n == 2)
                    dia[0][1]++;
                for(int p = 0; p < 3; p++){
                    for(int q = 0; q < 3; q++){
                        System.out.print((board[p][q]));
                        System.out.print(' ');
                    }
                    System.out.println();
                }

                if(checkWin(1,board,row,col,dia))
                {
                    aWin = true;
                    break;
                }
                turn = 2;
            }
            else if(turn == 2){
                System.out.println("Player 2(O) \nEnter position : ");
                m = in.nextInt();
                n = in.nextInt();

                board[m][n] = 'O';
                row[1][m]++;
                col[1][n]++;
                if(m == n)
                    dia[1][0]++;
                if(m + n == 2)
                    dia[1][1]++;
                for(int p = 0; p < 3; p++){
                    for(int q = 0; q < 3; q++){
                        System.out.print((board[p][q]));
                        System.out.print(' ');
                    }
                    System.out.println();
                }

                if(checkWin(2,board,row,col,dia)) {
                    aWin = true;
                    break;
                }
                turn = 1;
            }
        }
        if(!aWin)
            System.out.println("It is a tie. Game over.");

    }
}
