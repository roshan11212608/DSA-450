import java.util.Scanner;

public class LinearSearch {

    public static void Method(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("x is matched at index number: " + i);
            }
            
        }

    }

    public static void main(String[] args) {
        int input[] = { 10, 23, 123 ,223};
        int val = 223;
        Method(input, val);

    }
}
