package Greedy;

import java.util.*;

public class L00455_CookieDistributor 
{
    public static int findContentChildren(int[] g, int[] s) 
    {
        Arrays.sort(g); 
        Arrays.sort(s); 
        int i = 0, j = 0;

        while (i < g.length && j < s.length) 
        {
            if (s[j] >= g[i]) 
            {
                i++; 
            }
            j++; 
        }
        return i; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of children
        System.out.print("Enter number of children: ");
        int n = sc.nextInt();
        int[] g = new int[n];
        System.out.println("Enter greed factors of children:");
        for (int i = 0; i < n; i++) {
            g[i] = sc.nextInt();
        }

        // Input number of cookies
        System.out.print("Enter number of cookies: ");
        int m = sc.nextInt();
        int[] s = new int[m];
        System.out.println("Enter sizes of cookies:");
        for (int i = 0; i < m; i++) {
            s[i] = sc.nextInt();
        }

        int result = findContentChildren(g, s);
        System.out.println("Maximum number of content children: " + result);

        sc.close();
    }
}
// Enter number of children: 3
// Enter greed factors of children:
// 1 2 3
// Enter number of cookies: 2
// Enter sizes of cookies:
// 1 1
// Maximum number of content children: 1