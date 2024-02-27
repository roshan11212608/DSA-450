import java.lang.Math;
//import java.lang.ArrayIndexOutOfBoundsException.*;
public class ContainerWithMostWater {
    public static void Method(int[] arr) {
        int WaterStore = 0;
        int distance = 0;
        int i = 0;
        int h=0;
        int j = arr.length - 1;
        while (i < j) {
            distance = j - i;
            h = Math.min(arr[i], arr[j]);
            WaterStore = Math.max(distance * h, WaterStore);
            if (arr[i] < arr[j]) {
                i++;
            } else {
                j++;
            }

        }
        System.out.println("The maximum Contain Water is: " + WaterStore);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        //int[] arr = { 1, 4, 2, 3 };
        ContainerWithMostWater.Method(arr);
    }
}
// public class ContainerWithMostWater {

// public static int maxArea(int[] height) {
// int ContainWater = 0;
// int i = 0;
// int j = height.length - 1;

// while (i < j) {
// int h = Math.min(height[i], height[j]);
// int index = j-i;
// ContainWater = Math.max(ContainWater, h * index);

// if (height[i] < height[j]) {
// i++;
// } else {
// j--;
// }
// }

// return ContainWater;
// }

// public static void main(String[] args) {
// int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
// int result = maxArea(heights);
// System.out.println("The maximum area is: " + result);
// }
// }
