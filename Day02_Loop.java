import java.util.Scanner;
public class Day02_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = inputPositiveNumber(scanner);

        if (isPrime(n))
            System.out.println(n+" là số nguyên tố");
        else System.out.println(n+" KHÔNG PHẢI số nguyên tố");

        if (isPerfectNumber(n))
            System.out.println(n+" là số hoàn thiện");
        else System.out.println(n+" KHÔNG PHẢI số hoàn thiện");

        if (isPerfectSquare(n))
            System.out.println(n+" là số chính phương");
        else System.out.println(n+" KHÔNG PHẢI số chính phương");
    }

    static int inputPositiveNumber(Scanner scanner)
    {
        int n;
        do {
            System.out.println("Nhập n (n>0): ");
            n = scanner.nextInt();
        } while (n<=0);
        return n;
    }

    static boolean isPrime(int n)
    {
        if(n<2)
            return false;
        for(int i=2; i*i<=n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPerfectNumber(int n)
    {
        int sum=0;
        for (int i=1; i<n; i++)
        {
            if (n%i==0)
            {
                sum+=i;
            }
        }
        return sum==n;
    }

    static boolean isPerfectSquare(int n)
    {
        int sqrt= (int)Math.sqrt(n);
        return sqrt*sqrt==n;
    }
}
