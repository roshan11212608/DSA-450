
//package Matrix(2D Array);
import java.util.Scanner;

public class MatrixInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value n and m:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] Array = new int[n][m];
        System.out.println("Fill the "+n+" rows and "+m+" column: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Array[i][j] = sc.nextInt();

            }
        }
        System.out.println("2D Arrays are: ");
        for (int i = 0; i < Array.length ; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println("");

        }
    }
}
