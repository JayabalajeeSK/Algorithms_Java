package BruteForce;

import java.util.Scanner;

public class L00001_TwoSumFinder 
{
    public static int[] twoSum(int[] nums, int target) 
    {
        for(int i = 0; i < nums.length; i++) 
        {
            for(int j = i + 1; j < nums.length; j++) 
            {
                if(nums[i] + nums[j] == target) 
                {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; 
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        if(result.length == 0) 
        {
            System.out.println("No two numbers add up to the target.");
        } 
        else 
        {
            System.out.println("Indices: " + result[0] + " and " + result[1]);
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        }

        sc.close();
    }
}
// Enter size of array: 4
// Enter 4 elements:
// 2 7 11 15
// Enter target value: 9
// Indices: 0 and 1
// Values: 2 + 7 = 9