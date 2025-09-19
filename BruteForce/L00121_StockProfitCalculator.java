package BruteForce;

import java.util.Scanner;

public class L00121_StockProfitCalculator 
{
    public static int maxProfit(int[] prices) 
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) 
        {
            if (price < minPrice) 
            {
                minPrice = price; 
            } 
            else if (price - minPrice > maxProfit) 
            {
                maxProfit = price - minPrice; 
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter stock prices for " + n + " days:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int result = maxProfit(prices);

        if (result == 0) {
            System.out.println("No profit possible.");
        } else {
            System.out.println("Maximum Profit: " + result);
        }

        sc.close();
    }
}
// Enter number of days: 5
// Enter stock prices for 5 days:
// 7 1 5 3 6 4
// Maximum Profit: 5