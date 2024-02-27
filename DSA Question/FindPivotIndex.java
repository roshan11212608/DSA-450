import java.util.*;
import java.io.*;

public class FindPivotIndex {

    public static int Method(int[] arr) {
        int ArrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            ArrSum += arr[i];

        }
        int LeftSum = 0;
        int RightSum = ArrSum;
        for (int i = 0; i < arr.length; i++) {
            RightSum -= arr[i];
            if (LeftSum == RightSum) {
                return i;
            }
            LeftSum += arr[i];
            return -i;

        }
        System.out.println(RightSum);

    

    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 6, 5, 6 };
        Method(arr);

    }

}
