package lab3;

import java.util.Scanner;

public class Ex34Words {
    public static void main(String[] args) {
        String str = new String();
        System.out.println("Enter string : ");
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        int n = str.length();
        boolean flag = true;
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            if(str.charAt(i) != ' '){
                flag = true;
            }
            else if(str.charAt(i) == ' ' && flag == true){
                count++;
                flag = false;
            }
            else {
                continue;
            }
        }
        count++;
        System.out.println("Word Count : " + count);
    }
}
