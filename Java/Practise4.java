import java.lang.Math;
import java.util.Scanner;
public class Practise4 {
    public static void Method(int arr[]){
        int x=arr.length;
        int leftArr[]=new int[x];
        leftArr[0]=arr[0];
        for(int i=1;i<x;i++){
            leftArr[i]=Math.max(leftArr[i-1],arr[i]);
        }
        for(int i=0;i<leftArr.length;i++){
            System.out.print(leftArr[i]);
        }
        System.out.println("");
        // for right side
        int right[]=new int[x];
        right[x-1]=arr[x-1];
        for(int i=x-2;i>=0;i--){
            right[i]=Math.max(right[i+1], arr[i]);

        }
        for(int i=0;i<right.length;i++){
            System.out.print(right[i]);
        }
        System.out.println("");
        int ans=0;
        for(int i=0;i<x;i++){
            ans+=Math.min(leftArr[i],right[i])-arr[i];
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your array Size: ");
        int Size=Sc.nextInt();
        int arr[]=new int[Size];
        for(int i=0;i<Size;i++){
            arr[i]=Sc.nextInt();

        }
        
        Method(arr);
    }
    
}
