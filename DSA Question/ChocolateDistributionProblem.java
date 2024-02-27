import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void Method(int arr[],int m) {
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            for(int j=m-1;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.println(arr[k]);
                }
                System.out.println(" ");

            }
        }


    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 2, 4, 9, 12, 56 };
        int m=3;
        
        Method(arr,m);

    }
} 