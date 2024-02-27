public class MaxSubArray {
    public static void SubArray(int n[]) {

        for (int i = 0; i < n.length; i++) {
            for (int j = i; j < n.length; j++) {
                for (int k = i; k <= j; k++) {

                    System.out.print("{ " + n[k] + " }");
                }

            }

            System.out.println("  ");
        }
        System.out.println();

    }

    public static void main(String args[]) {
        int[] Array = { 1, -2, 3, -4, 5 };
        SubArray(Array);

    }
}
