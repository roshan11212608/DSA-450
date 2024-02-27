import java.lang.Math;

public class BuyAndSellStock {
    public static void Method(int[] arr) {
        int n = arr.length;
        int costPrice = arr[0];
        int MaxProfit = 0;
        int Profit = 0;

        for (int i = 1; i < n; i++) {
            int sellingprice = arr[i];
            costPrice = Math.min(costPrice, sellingprice);
            Profit = sellingprice - costPrice;
            MaxProfit = Math.max(MaxProfit, Profit);

        }

        System.out.println("Maximum Profit Amount is " + MaxProfit);

    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 10, 1, 4 };
        Method(arr);

    }
}