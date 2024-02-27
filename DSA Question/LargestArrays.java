import java.util.Scanner;
public class LargestArrays {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter Your ArraySize: ");
        int arraysize=Sc.nextInt();
        int[] array=new int[arraysize];
        System.out.print("Enter Your Arrays Element: ");
        for(int i=0;i<arraysize;i++){
            array[i]=Sc.nextInt();
        }
        System.out.print("Your Arrays are as follows");
        for(int i =0;i<arraysize;i++){
            System.out.print(array[i]+"  ");
        }
        System.out.print("Your Reverse Arrays are as follows");
        for(int i =arraysize-1;i>=0;i--){
            System.out.print(array[i]+"  ");
        }
        int max,min;
        max=min=array[0];
        for(int i=0;i<arraysize;i++){
            if (array[i]>max){
                max=array[i];

            }
            else if (array[i]<min){
                min=array[i];

            }
        }
        System.out.println("Largest Element: " +max);
        System.out.println("Smallest Element: " +min);
        
    }
    
}
