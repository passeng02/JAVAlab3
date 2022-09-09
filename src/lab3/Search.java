package lab3;

import java.util.Random;
import java.util.Scanner;


public class Search {
    static void searchLinear(int[] arr,int n, int k){
        boolean InArr = false;
        int ncomp = 0;
        for(int  i = 0 ; i < n; i++) {
            ncomp++;
            if (arr[i] == k) {
                InArr = true;
                System.out.println(k + " Found at " + (i + 1));
                break;
            }
        }
        if(!InArr)
            System.out.println(k + " not found in the array");
        System.out.println("Comparisons : " + ncomp);
    }

    static void searchLinear(char[] arr,int n, char k){
        boolean InArr = false;
        int ncomp = 0;
        for(int  i = 0 ; i < n; i++) {
            ncomp++;
            if (arr[i] == k) {
                InArr = true;
                System.out.println(k + " Found at " + (i + 1));
                break;
            }
        }
        if(!InArr)
            System.out.println(k + " not found in the array");
        System.out.println("Comparisons : " + ncomp);
    }

    static void searchBinary(int[] arr, int n, int k)
    {
        System.out.println("\nWith Binary Search : ");
        int mid = n/2;
        boolean InArr = false;
        int i = 0,j = n -1,comp = 0;

        while(i <= j){
            mid = i + (j-i)/2;
            comp++;
            if(k == arr[mid]){
                InArr = true;
                System.out.println(k + " Found at " + (i + 1));
                break;
            }
            else if(k < arr[mid]){
                j  = mid-1;
            }
            else {
                i = mid+1;
            }
        }

        if(!InArr)
            System.out.println(k + " not found in the array");
        System.out.println("Comparisons : " + comp);
    }

    static void searchBinary(char[] arr, int n, char k)
    {
        System.out.println("\nWith Binary Search : ");
        int mid = n/2;
        boolean InArr = false;
        int i = 0,j = n -1,comp = 0;

        while(i <= j){
            mid = i + (j-i)/2;
            comp++;
            if(k == arr[mid]){
                InArr = true;
                System.out.println(k + " Found at " + (i + 1));
                break;
            }
            else if(k < arr[mid]){
                j  = mid-1;
            }
            else {
                i = mid+1;
            }
        }

        if(!InArr)
            System.out.println(k + " not found in the array");
        System.out.println("Comparisons : " + comp);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int k;
        char c;

        System.out.print("Enter n(size of array) : ");
        int n = in.nextInt();
        System.out.print("Integers or Chars ? (0/1) : ");
        int ch = in.nextInt();

        switch (ch) {
            case 0:
                int[] iarr = new int[n];

                for (int i = 0; i < n; i++) {
                    iarr[i] = rand.nextInt(n);
                }
                BubbleSort1.sortInts(iarr, n);
                System.out.println("\nEnter element to search (0 - " + (n-1) + ") : ");
                k = in.nextInt();
                searchLinear(iarr,n,k);
                searchBinary(iarr,n,k);
                break;
            case 1:
                char[] carr = new char[n];

                for (int i = 0; i < n; i++) {
                    carr[i] = (char) ('a' + rand.nextInt(25));
                }
                BubbleSort1.sortChars(carr, n);
                System.out.println("\nEnter element to search (a - z) : ");
                c = in.next().charAt(0);
                searchLinear(carr,n,c);
                searchBinary(carr,n,c);
                break;
            default:
                System.out.println("Enter valid choice!!");
        }
    }
}
