package lab3;

import java.util.Scanner;

public class Ex6CompareVersion {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String();
        System.out.println("Enter string 1 : ");
        Scanner in = new Scanner(System.in);
        str1 = in.nextLine();
        int n1 = str1.length();
        System.out.println("Enter string 2 : ");
        str2 = in.nextLine();
        int n2 = str2.length();
        String[] sarr1 = str1.split("\\.");
        String[] sarr2 = str2.split("\\.");

        int[] iarr1 = new int[3];
        int[] iarr2 = new int[3];

        iarr1[0] = Integer.parseInt(sarr1[0]);
        iarr1[1] = Integer.parseInt(sarr1[1]);
        iarr1[2] = Integer.parseInt(sarr1[2]);
        iarr2[0] = Integer.parseInt(sarr2[0]);
        iarr2[1] = Integer.parseInt(sarr2[1]);
        iarr2[2] = Integer.parseInt(sarr2[2]);
        int flag = 0;
        for (int i = 0; i < 3; i++) {
            if (iarr1[i] > iarr2[i]) {
                System.out.println(str1 + " > " + str2);
                flag = 1;
                break;
            } else if (iarr1[i] < iarr2[i]) {
                System.out.println(str2 + " > " + str1);
                flag = 1;
                break;
            } else {
                continue;
            }

        }

        if(flag == 0)
            System.out.println(str1 + " = " + str2);
    }
}
