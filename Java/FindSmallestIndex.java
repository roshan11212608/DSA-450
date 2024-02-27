public class FindSmallestIndex{

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 9, 4};
        int index = findSmallestIndex(arr);
        System.out.println("Smallest element is at index: " + index);
    }

    public static int findSmallestIndex(int[] arr) {
       // if (arr == null || arr.length == 0) {
         //   throw new IllegalArgumentException("Array must not be empty or null");
        //}
        
        int smallest = arr[0];
        int index = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                index = i;
            }
        }
        
        return index;
    }
}
