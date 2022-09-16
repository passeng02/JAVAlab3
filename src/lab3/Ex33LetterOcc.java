package lab3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ex33LetterOcc {
    public static void main(String[] args) {

        String str = new String();
        System.out.println("Enter string : ");
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        int n = str.length();
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);
        for(int  i  = 0; i < n ; i++) {
            int Count = 0;
            if (!visited[i] && str.charAt(i) != ' ') {
                Count++;
                for (int j = i + 1; j < n; j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        Count++;
                        visited[j] = true;
                    }
                }
                System.out.println(str.charAt(i) + " : " + Count);
            }
        }
    }
}
