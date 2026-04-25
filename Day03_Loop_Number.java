import java.util.Scanner;
public class Day03_Loop_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập dãy số n (n>0): ");
            n = scanner.nextInt();
        }while(n<=0);

        int temp=n;
        while (temp!=0)
        {
            int k=temp%10;
            System.out.print(k+"\t");
            temp/=10;
        }
        System.out.println();
        int x=1, temp2=n;
        while (x<=temp2)
        {
            x*=10;
        }
        x/=10;
        while (temp2!=0)
        {
            int k=temp2/x;
            System.out.print(k+"\t");
            temp2=temp2%x;
            x/=10;
        }
    }
}