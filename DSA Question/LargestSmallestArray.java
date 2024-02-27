import java.util.Scanner;

public class LargestSmallestArray {
    static void Method(int arr[]) {
        int Max = arr[0];
        int Min = arr[0];
   

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];

            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        
        System.out.println("Largest Value " + Max);
        System.out.println("Smallest Value " + Min);

    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your Array Size: ");
        int ArraySize = Sc.nextInt();
        int[] arr = new int[ArraySize];
        for (int i = 0; i < ArraySize; i++) {
            arr[i] = Sc.nextInt();
        }
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);

        }

        LargestSmallestArray.Method(arr);

    }
}