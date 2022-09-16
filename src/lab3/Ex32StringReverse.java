package lab3;

import java.util.Scanner;

public class Ex32StringReverse {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter String : ");
        str.append(in.next());
        int i = 0;
        int j = str.length() - 1;
        while(i < j) {
            char t = str.charAt(j);
            str.setCharAt(j, str.charAt(i)) ;
            str.setCharAt(i, t);
            i++;
            j--;
        }
        System.out.println("Reverse : " + str);
    }
}
