public class Practise {
    public static void Method(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int MaxContainWater = 0;
        while (left < right) {
            int h = Math.min(arr[left], arr[right]);
            int distance = right - left;
            int ContainWater=h*distance;
            MaxContainWater = Math.max(MaxContainWater, ContainWater);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }

        }
        System.out.println("The Max Contain Water is: "+MaxContainWater);

    }

    public static void main(String[] args) {
       // int[] arr = { 1, 8, 3, 4, 7, 2 };
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        // int result=Method(arr);
        // System.out.println(result);
        Method(arr);

    }
}