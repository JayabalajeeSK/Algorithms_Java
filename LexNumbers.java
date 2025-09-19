import java.util.*;

public class LexNumbers 
{
    public static List<Integer> lexicalOrder(int n) 
    {
        List<Integer> result = new ArrayList<>();
        int curr = 1;

        for (int i = 0; i < n; i++) 
        {
            result.add(curr);

            if (curr * 10 <= n) 
            {
                // go to next level (append 0)
                curr = curr * 10;
            } 
            else 
            {
                // go to next number
                if (curr >= n) curr /= 10; // move up if exceeds n
                curr++;                     // move to next
                while (curr % 10 == 0) curr = curr / 10; // remove trailing zeros
            }
        }
        return result;
    }

    public static void main(String[] args) 
    {
        System.out.println(lexicalOrder(13));
        System.out.println(lexicalOrder(2));
    }
}
// [1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9]
// [1, 2]