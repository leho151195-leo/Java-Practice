import java.util.Scanner;
public class Day03_Loop_LengString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str=scanner.nextLine();
        int letters=0, digits=0, spaces=0, another=0;
        for(int i=0; i<str.length();i++)
        {
            char c=str.charAt(i);
            if(Character.isLetter(c))
                letters++;
            else if(Character.isWhitespace(c))
                spaces++;
            else if(Character.isDigit(c))
                digits++;
            else {
                another++;
            }
        }
        System.out.println("Số chữ cái: "+letters);
        System.out.println("Số kí tự: "+digits);
        System.out.println("Số khoảng trắng: "+spaces);
        System.out.println("Số kí tự khác: "+another);
    }
}

