import java.util.Scanner;

public class SumOfAllOddNumber {
    public static void Function(int n) {
        int OddNumber=0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                OddNumber = OddNumber + i;
              

            }

        }
          System.out.println(OddNumber);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = Sc.nextInt();
        Function(n);
    }
}
