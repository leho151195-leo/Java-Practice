import java.util.Scanner;
public class Day05_Ham_DemoHam {
    static Scanner scanner = new Scanner(System.in);

    public static int NhapSoNguyen(){
        int n;
        do {
            System.out.print("Nhập số nguyên n (n>0):");
            n= scanner.nextInt();
        } while(n<=0);
        return n;
    }
    public static boolean isPrime(int n){
        int demus=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                demus++;
            }
        }
        return demus==2;
    }
    public static void InSoNguyenTo(int n){
        System.out.println(String.format("Số nguyên tố < %d là: ",n));
       for (int i=1;i<=n;i++)
       {
           if (isPrime(i))
           {
               System.out.print(i+"\t");
           }
       }
    }
    public static void main(String[] args){
        int number=NhapSoNguyen();

        if (isPrime(number))
        {
            System.out.println(String.format("%d là SNT", number));
        }
        else
        {
            System.out.println(String.format("%d KO là SNT", number));
        }
        InSoNguyenTo(number);
    }
}
