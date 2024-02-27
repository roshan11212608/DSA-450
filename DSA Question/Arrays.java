import java.util.Scanner;
public class Arrays{
    public static void main(String[] args){
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter Your ArraySize: ");
        int arraysize=Sc.nextInt();
        int [] arr=new int[arraysize];
        for(int i=0;i<arraysize; i++){
            arr[i]=Sc.nextInt();
        }
        System.out.print("Your Arrays are");
        for (int i=0;i<arraysize;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.print("Your Reverse  Arrays are");
        for (int i=0;i<arraysize;i++){
            System.out.println(arr[i] +" ");
        }
        int max,min,i;
        max=min=arr[0];
        for(i=0;i<arraysize;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print("Largest Number: " +max);
        System.out.print("Smallest Number: " +min);


    }
}