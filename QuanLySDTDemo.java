import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLySDTDemo {

    public static void main(String[] args) {
        /**
         * 5.3. Quản lý danh bạ điện thoại
         * Yêu cầu: Viết chương trình quản lý danh bạ điện thoại như sau:
         * - Khai báo danh sách liên hệ (danh bạ điện thoại) là một ArrayList. Với mỗi liên hệ gồm tên và số điện thoại: "Tên - Số điện thoại".
         * - Thêm liên hệ mới: Cho phép người dùng nhập tên và số điện thoại cho đến khi không nhập nữa (không nhập tên mà nhấn phím ‘Enter’)
         * - In danh sách.
         * - Sắp xếp danh sách theo tên.
         * - Tìm kiếm liên hệ theo tên.
         * - Xóa liên hệ theo tên.
         */

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> contacts = new ArrayList<>();
        contacts.add("Lê Hồng Phong - 0911222444");
        contacts.add("An Dương Vương - 0911222333");
        contacts.add("Lạc Long Quân - 0911222555");

        int select = 0;
        do {
            System.out.println("---- Chương trình quản lý danh bạ điện thoại ----");
            System.out.println("1. Thêm liên hệ mới");
            System.out.println("2. In danh sách");
            System.out.println("3. Sắp xếp danh sách theo tên");
            System.out.println("4. Tìm kiếm liên hệ theo tên");
            System.out.println("5. Xóa liên hệ theo tên");
            System.out.println("0. Thoát");

            System.out.println("Vui lòng nhập lựa chọn của bạn: ");
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.println("1. Thêm liên hệ mới");
                    String newContact = inputContact(scanner);
                    contacts.add(newContact);
                    break;
                case 2:
                    System.out.println("2. In danh sách");
                    printContacts(contacts);
                    break;
                case 3:
                    System.out.println("3. Sắp xếp danh sách theo tên");
                    Collections.sort(contacts);
                    printContacts(contacts);
                    break;
                case 4:
                    System.out.println("4. Tìm kiếm liên hệ theo tên");
                    scanner.nextLine();
                    System.out.println("Nhập tên cần tìm: ");
                    String findName = scanner.nextLine();
                    String findContact = findContact(findName, contacts);
                    if (findContact != null && findContact.length() > 0) {
                        System.out.println(String.format("Trong danh bạ có tồn tại tên: %s", findName));
                    } else {
                        System.out.println(String.format("Trong danh bạ không tồn tại tên: %s", findName));
                    }
                    break;
                case 5:
                    System.out.println("5. Xóa liên hệ theo tên");
                    System.out.println("Nhập tên cần xóa: ");
                    scanner.nextLine();
                    String deleteName = scanner.nextLine();
                    deleteContact(deleteName, contacts);
                    break;
            }
        } while (select != 0);

    }

    private static void deleteContact(String name, ArrayList<String> contacts) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).toLowerCase().contains(name.toLowerCase())) {
                contacts.remove(i);
                i--;
                System.out.println(String.format("Xóa danh bạ '%s' thành công", name));
            }
        }
        printContacts(contacts);
    }

    private static String findContact(String name, ArrayList<String> contacts) {
        for (String contact : contacts) {
            if (contact.toLowerCase().contains(name.toLowerCase())) {
                System.out.println(String.format("Tìm thấy tên '%s' trong danh bạ", name));
                return contact;
            }
        }
        return "";
    }

    private static String inputContact(Scanner scanner) {
        System.out.println("Nhập tên: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        String phone = scanner.nextLine();
        String contact = String.format("%s - %s", name, phone);
        return contact;
    }

    private static void printContacts(ArrayList<String> contacts) {
        for (String contact : contacts) {
            System.out.println(contact);
        }
    }
}
