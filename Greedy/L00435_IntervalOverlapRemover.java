package Greedy;

import java.util.*;

public class L00435_IntervalOverlapRemover 
{
    public static int eraseOverlapIntervals(int[][] intervals) 
    {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 0, prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) 
        {
            if (intervals[i][0] < prevEnd) 
            {
                count++; // overlap found, need to remove
            } 
            else 
            {
                prevEnd = intervals[i][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of intervals
        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];
        System.out.println("Enter intervals (start end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt(); // start
            intervals[i][1] = sc.nextInt(); // end
        }

        int result = eraseOverlapIntervals(intervals);

        System.out.println("Minimum intervals to remove: " + result);

        sc.close();
    }
}
// Enter number of intervals: 4
// Enter intervals (start end):
// 1 2
// 2 3 
// 3 4
// 1 3
// Minimum intervals to remove: 1