package Greedy;

import java.util.*;

public class L00055_JumpGameChecker 
{
    public static boolean canJump(int[] nums) 
    {
        int farthest = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if (i > farthest) return false; 
            farthest = Math.max(farthest, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = canJump(nums);

        if (result) {
            System.out.println("Yes, you can reach the last index.");
        } else {
            System.out.println("No, you cannot reach the last index.");
        }

        sc.close();
    }
}
// Enter size of array: 5
// Enter 5 elements:
// 2 3 1 1 4
// Yes, you can reach the last index.