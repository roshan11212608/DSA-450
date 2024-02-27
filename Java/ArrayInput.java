import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        // reading the number of elements from the that we want to enter
        int n = sc.nextInt();
        // creates an array in the memory of length 10
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            // reading array elements from the user
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        // accessing array elements using the for loop
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        int max, min;
        max = min = array[0];
        for (int p = 1; p < n; p++) {
            if (array[p] > max) {
                max = array[p];
            } else if (array[p] < min) {
                min = array[p];
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);

    }
}