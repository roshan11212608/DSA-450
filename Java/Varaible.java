import java.util.Scanner;
public class Varaible {
    public static int StaticVaraible = 10;// static or class varaible
    public int InstanceVaraible;// instance Variable

    public Varaible() {
        this.InstanceVaraible = 988;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int Data=sc.nextInt();
        int localVaraible=98; // local variable
        System.out.println(localVaraible);
        System.out.println(StaticVaraible);
        Varaible obj = new Varaible();

        System.out.println(obj.InstanceVaraible);

    }

}