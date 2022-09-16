package lab3;

import java.util.Scanner;

public class Ex5Palindrome {
    public static void main(String [] args) {
        StringBuffer str = new StringBuffer();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter String : ");
        str.append(in.next());
        int i = 0;
        int j = str.length() - 1;
        boolean isPal = true;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                isPal = false;
                break;
            }
            i++;
            j--;
        }
        if(isPal)
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }

}
