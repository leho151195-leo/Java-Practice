import java.util.Scanner;
import java.util.Arrays;
public class Day04_Arrays_Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Tạo mảng
        String[] Drinks = {"Bạc xỉu đá", "Freeze trà xanh", "Trà thạch vải", "Trà thanh đào", "Cappuccino", "Cà phê sữa đá"};
        System.out.println(Arrays.toString(Drinks));
        //Nhập tên thức uống
        System.out.println("Nhập tên thức uống: ");
        String name = scanner.nextLine();
        //Đặt điều kiện
        boolean isFound = false;
        for (String ThucUong : Drinks) {
            if (name.equalsIgnoreCase(ThucUong)) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Đã tìm thấy thức uống: " + name);
            System.out.println(Arrays.toString(Drinks));
        } else {
            System.out.println("Bạn muốn thêm " + name + " vào ko? (y/n)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                String[] newDrinks = new String[Drinks.length + 1];
                for (int i = 0; i < Drinks.length; i++) {
                    newDrinks[i] = Drinks[i];
                }
                newDrinks[newDrinks.length - 1] = name;
                System.out.println(Arrays.toString(newDrinks));
            }
        }

    }
}
