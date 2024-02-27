public class Practise1 {

    public static int findPivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1; // No pivot index found
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int pivotIndex = findPivotIndex(arr);
        if (pivotIndex != -1) {
            System.out.println("Pivot Index: " + pivotIndex);
            System.out.println("Pivot Element: " + arr[pivotIndex]);
        } else {
            System.out.println("No pivot index found.");
        }
    }
}
