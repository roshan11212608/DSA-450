import java.util.Scanner;

public class RadiusOfCircle {
    public static void Method(int r){
        double Radius=r*r*3.17;
        System.out.println("Radius Of a circle are : "+ Radius);


    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the value of R: ");
        int R=Sc.nextInt();
        Method(R);
    }
}
