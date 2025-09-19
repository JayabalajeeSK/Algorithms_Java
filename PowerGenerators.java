import java.util.Scanner;

public class PowerGenerators 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int gen1 = A / B;

        int gen2 = C / D;

        int total = gen1 + gen2;

        System.out.println(total);

        sc.close();
    }
}
// 520
// 3
// 100
// 1
// 273

