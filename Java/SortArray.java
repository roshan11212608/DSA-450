import java.util.Arrays;
public class SortArray {
    public static void Method(int []arr){
        Arrays.sort(arr);
        int min=arr[0];
        int max=arr[arr.length-1];
        System.out.println("Max: "+max);
        System.out.println(min);

    }
    public static void main(String[] args) {
        int arr[]={225,56,32,44,1123,34,52,81,3};
        Method(arr);
    }
    
}
