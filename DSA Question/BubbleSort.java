import java.util.*;
public class BubbleSort {
    public static void Method(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //Swapping_here
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);

        }
      
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        Method(arr);

    }

}
