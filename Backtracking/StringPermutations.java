package Backtracking;

import java.util.*;

public class StringPermutations 
{

    public static void generatePermutations(char[] characters, int currentIndex, int lastIndex, List<String> allPermutations) {
        if (currentIndex == lastIndex) 
        {
            allPermutations.add(new String(characters));
        } 
        else 
        {
            for (int swapIndex = currentIndex; swapIndex <= lastIndex; swapIndex++) 
            {
                char temp = characters[currentIndex];
                characters[currentIndex] = characters[swapIndex];
                characters[swapIndex] = temp;

                generatePermutations(characters, currentIndex + 1, lastIndex, allPermutations);

                temp = characters[currentIndex];
                characters[currentIndex] = characters[swapIndex];
                characters[swapIndex] = temp;
            }
        }
    }

    public static List<String> getAllPermutations(String inputString) 
    {
        List<String> allPermutations = new ArrayList<>();
        char[] characters = inputString.toCharArray();

        generatePermutations(characters, 0, characters.length - 1, allPermutations);

        Collections.sort(allPermutations);

        return allPermutations;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        List<String> permutations = getAllPermutations(input);

        System.out.println("Permutations in lexicographical order:");
        for (String permutation : permutations) 
        {
            System.out.println(permutation);
        }

        scanner.close();
    }
}

// Enter string: xY
// Permutations in lexicographical order:
// Yx
// xY

// Enter string: ABC
// Permutations in lexicographical order:
// ABC
// ACB
// BAC
// BCA
// CAB
// CBA