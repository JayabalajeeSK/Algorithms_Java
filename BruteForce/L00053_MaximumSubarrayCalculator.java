package BruteForce;

import java.util.Scanner;

public class L00053_MaximumSubarrayCalculator 
{
    public static int maxSubArray(int[] nums) 
    {
        int maximum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) 
        {
            sum += nums[i];

            if (sum > maximum) 
            {
                maximum = sum;
            }

            if (sum < 0) 
            {
                sum = 0;
            }
        }

        return maximum;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);

        sc.close();
    }
}
// Enter size of array: 9
// Enter 9 elements:
// -2 1 -3 4 -1 2 1 -5 4
// Maximum Subarray Sum: 6