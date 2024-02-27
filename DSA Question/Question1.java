import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array= ");
        int arraysize = sc.nextInt();
        int[] array = new int[arraysize];
        System.out.println("Enter your" + arraysize + " the array=");
        for (int i = 0; i < arraysize; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array Elementys are: ");
        for (int j = 0; j < arraysize; j++) {
            System.out.print(array[j]+" ");
        }

        System.out.println("Reverse array are:");
        for (int k = arraysize - 1; k >= 0; k--) {
            System.out.println(array[k]);
        }
        int max, min;
        max = min = array[0];

        for (int m = 1; m < arraysize; m++) {
            if (array[m] > max)
                max = array[m];
            else if (array[m] < min)
                min = array[m];

        }

        System.out.println("Largest Number : " + max);
        System.out.println("Smallest Number : " + min);

    }
}