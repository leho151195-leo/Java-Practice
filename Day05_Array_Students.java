import java.util.Scanner;
import java.util.Random;
public class Day05_Array_Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        int[][] Score = new int[n][4];
        for (int i = 0; i < Score.length; i++) {
            //System.out.println("Sinh viên " + (i + 1));
            for (int j = 0; j < Score[i].length; j++) {
               // System.out.println("Nhập điểm môn " + (j + 1));
                // Score[i][j] = scanner.nextInt();
                Score[i][j]=random.nextInt(10);
            }
        }

        System.out.printf("%-10s %-10s %-10s %-10s", "Môn 1", "Môn 2", "Môn 3", "Môn 4");

        for (int i = 0; i < Score.length; i++) {
            System.out.println();
            for (int j = 0; j < Score[i].length; j++) {
                System.out.printf("%-11d",Score[i][j]);
            }
        }
        System.out.println();
    }
}