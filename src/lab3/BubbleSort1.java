package lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class BubbleSort1 {
    static void iswap(int[] arr, int i){
        int t = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = t;
    }
    static void cswap(char[] arr, int i){
        char t = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = t;
    }
    static void sortInts(int[] arr, int n){
        boolean didSwap27 = true;
        int comp27 = 0, nswap27 = 0;
        System.out.println("\n Before sort " + '\n' + Arrays.toString(arr));
        for(int  i = 0 ; i < n-1 && didSwap27; i++){
            didSwap27 = false;
            for(int  j = 0 ; j < n - 1 - i; j++){
                comp27++;
                if(arr[j] > arr[j+1]){
                    nswap27++;
                    didSwap27 = true;
                    iswap(arr,j);
                }
            }
            System.out.println("\n After pass " + (i+1) + '\n' + Arrays.toString(arr));

        }

        System.out.print("\nComparisons = " + comp27 + " Swaps = " + nswap27);


    }

    static void sortChars(char[] arr, int n){
        boolean didSwap27 = true;
        int comp27 = 0, nswap27 = 0;
        System.out.println("\n Before sort " + '\n' + Arrays.toString(arr));
        for(int  i = 0 ; i < n-1 && didSwap27; i++){
            didSwap27 = false;
            for(int  j = 0 ; j < n - 1 - i; j++){
                comp27++;
                if(arr[j] > arr[j+1]){
                    nswap27++;
                    didSwap27 = true;
                    cswap(arr,j);
                }
            }
            System.out.println("\n After pass " + (i+1) + '\n' + Arrays.toString(arr));

        }

        System.out.print("\nComparisons = " + comp27 + " Swaps = " + nswap27);


    }
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);


        System.out.print("Enter n(size of array) : ");
        int n = in.nextInt();
        System.out.print("Integers or Chars ? (0/1)");
        int ch = in.nextInt();

        switch(ch) {
            case 0 :
            int[] iarr = new int[n];

            for (int i = 0; i < n; i++) {
                iarr[i] = rand.nextInt(n);
            }
                sortInts(iarr,n);
            break;
            case 1 :
                char[] carr = new char[n];

                for (int i = 0; i < n; i++) {
                    carr[i] = (char)('a' + rand.nextInt(25));
                }
                sortChars(carr,n);
                break;
            default :
                System.out.println("Enter valid choice!!");
        }




    }

}
