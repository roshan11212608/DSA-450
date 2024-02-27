import java.util.Scanner;
public class Average {
    public static void Function(int x,int y,int z){
        if(x>y && x>z){
            System.out.println("Largest Number are: "+x);
        }
         else if(y>x && y>z){
            System.out.println("Largest Number are: "+y);
        }
        else if(z>y && z>x){
            System.out.println("Largest Number are: "+z);
        }
        int Sum=(x+y+z)/3;
        System.out.println("Average Value is "+Sum);


    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the value of x,y,z:");
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        int c=Sc.nextInt();
        Function(a,b,c);
    }
    
}
