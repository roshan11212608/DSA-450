import java.util.Scanner;

public class Practise2 {

    public static void linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("x is matched at index number: " + i);
            }
        }

    }

    public static void main(String[] args) {
        int input[] = { 10, 23, 123 };
        int val = 23;
        Practise2.linearSearch(input, val);

    }
}
