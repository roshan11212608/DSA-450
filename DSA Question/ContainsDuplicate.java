import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 14 }; // Example array
        System.out.println(containsDuplicate1(nums)); // Should print true
    }

    public static boolean containsDuplicate1(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);
        String x="True";
        // Step 2: Iterate through the sorted array to find duplicates
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
