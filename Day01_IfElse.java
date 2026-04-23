import java.util.Scanner;

public class Day01_IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int d = scanner.nextInt();

        System.out.print("Nhập tháng: ");
        int m = scanner.nextInt();

        System.out.print("Nhập năm: ");
        int y = scanner.nextInt();

        boolean isvalid = true;
        int daymax=0;
        switch(m)
        {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
            {
                daymax=31;
                break;
            }
            case 2:
            {
                if (y%400==0||y%4==0&&y%100!=0)
                {
                    daymax=29;
                }
                else
                {
                    daymax=28;
                }
                break;
            }
            case 4:case 6: case 9:case 11:
            {
                daymax=30;
                break;
            }
        }
        if (d<=0||d>daymax)
        {
            isvalid=false;
        }
        if (m <=0 || m > 12)
        {
            isvalid = false;
        }
        if (y <= 0) {
            isvalid = false;
        }

        int temp=0;
        for (int i=1; i<m;i++)
        {
            switch(i)
            {
                case 1:case 3:case 5:case 7:case 8:case 10:case 12:
            {
                temp+=31;
                break;
            }
                case 2:
                {
                    if (y%400==0||y%4==0&&y%100!=0)
                    {
                        temp+=29;
                    }
                    else
                    {
                        temp+=28;
                    }
                    break;
                }
                case 4:case 6: case 9:case 11:
                {
                temp += 30;
                break;
                }
            }
        }
        temp=temp+d;

        if (isvalid)
        {
            System.out.println("Kết quả: " + d + "/" + m + "/" + y);
            System.out.println("là ngày thứ " +temp+" trong năm");
        }
        else
        {
            System.out.println("Ngày ko hợp lệ");
        }
    }
}
