import java.util.Scanner;
public class Again{
    public static void Method(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int ArraySize=sc.nextInt();
        int[] Array=new int[ArraySize];
        for(int i=0;i<ArraySize;i++){
            Array[i]=sc.nextInt();
            
        }
        System.out.println("Original Array are: ");
        for(int i=0;i<ArraySize;i++){
            System.out.println(Array[i]);
        }
        System.out.println("Reverse Array are: ");
        for(int j=Array.length-1;j>=0;j--){
            System.out.println(Array[j]);
        }
        int min,max;
        min=max=Array[0];
        for(int k=0;k<ArraySize;k++){
            if(max<Array[k]){
                max=Array[k];

            }
            else if(min>Array[k])
                min=Array[k];
        }
        System.out.println("max"+max);
        System.out.println("min"+min);

    }
    public static void main(String[] args) {
        Method();
        
    }
}