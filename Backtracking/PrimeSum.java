package Backtracking;

import java.util.*;

public class PrimeSum 
{

    public static boolean isPrime(int num) 
    {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static List<Integer> generatePrimesAfterP(int P, int S) 
    {
        List<Integer> primes = new ArrayList<>();
        for (int i = P + 1; i <= S; i++) 
        {
            if (isPrime(i)) primes.add(i);
        }
        return primes;
    }

    public static void findCombinations(List<Integer> primes, int N, int S, int start, List<Integer> current, List<List<Integer>> result, int currentSum) 
    {
        if (current.size() == N) 
        {
            if (currentSum == S) 
            {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        for (int i = start; i < primes.size(); i++) 
        {

            if (currentSum + primes.get(i) > S) break;

            current.add(primes.get(i));

            findCombinations(primes, N, S, i + 1, current, result, currentSum + primes.get(i));
            
            current.remove(current.size() - 1); 
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();
        System.out.print("Enter P: ");
        int P = sc.nextInt();
        System.out.print("Enter S: ");
        int S = sc.nextInt();

        List<Integer> primes = generatePrimesAfterP(P, S);

        List<List<Integer>> result = new ArrayList<>();
        findCombinations(primes, N, S, 0, new ArrayList<>(), result, 0);

        if (result.isEmpty()) 
        {
            System.out.println("No combination found.");
        } 
        else 
        {
            for (List<Integer> combination : result) 
            {
                for (int num : combination) 
                {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
// Enter N: 2
// Enter P: 7
// Enter S: 30
// 11 19
// 13 17