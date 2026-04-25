import java.util.Scanner;
public class Day03_Loop_Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m, n;
        do {
            System.out.print("Nhập m (m>0): ");
            m = scanner.nextInt();
        } while (m<=0);
        do {
            System.out.print("Nhập n (n>m ): ");
            n = scanner.nextInt();
        } while(n<m);

        for(int i=m;i<=n;i++) {
            System.out.println("-----------");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}