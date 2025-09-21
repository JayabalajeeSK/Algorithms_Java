package Backtracking;

import java.util.*;

public class MatrixPaths 
{

    public static void findPaths(int[][] matrix, int row, int col, List<Integer> currentPath, List<List<Integer>> allPaths) {
        int m = matrix.length;
        int n = matrix[0].length;

        currentPath.add(matrix[row][col]);

        if (row == m - 1 && col == n - 1) 
        {
            allPaths.add(new ArrayList<>(currentPath));
        } 
        else 
        {
            if (row < m - 1) 
            {
                findPaths(matrix, row + 1, col, currentPath, allPaths);
            }
            if (col < n - 1) 
            {
                findPaths(matrix, row, col + 1, currentPath, allPaths);
            }
        }

        currentPath.remove(currentPath.size() - 1);
    }

    public static List<List<Integer>> getAllPaths(int[][] matrix) 
    {
        List<List<Integer>> allPaths = new ArrayList<>();

        if (matrix == null || matrix.length == 0) return allPaths;

        findPaths(matrix, 0, 0, new ArrayList<>(), allPaths);
        return allPaths;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Enter matrix elements row by row:");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        List<List<Integer>> paths = getAllPaths(matrix);

        System.out.println("All possible paths from top-left to bottom-right:");
        for (List<Integer> path : paths) 
        {
            System.out.println(path);
        }

        sc.close();
    }
}
// Enter number of rows: 2
// Enter number of columns: 2
// Enter matrix elements row by row:
// 1 2
// 3 4
// All possible paths from top-left to bottom-right:
// [1, 3, 4]
// [1, 2, 4]