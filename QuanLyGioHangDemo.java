
import java.util.ArrayList;

public class QuanLyGioHangDemo{
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        products.add("Sữa tắm");
        products.add("Dầu gội");
        products.add("Dầu xả");
        products.add("Xà phòng tắm");
        products.add("Kem đánh răng");

        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(75000);
        prices.add(135000);
        prices.add(128000);
        prices.add(18000);
        prices.add(25000);

        ArrayList<Integer> carts = new ArrayList<>();
        carts.add(0);
        carts.add(2);

        ArrayList<Integer> quantities = new ArrayList<>();
        quantities.add(1);
        quantities.add(3);

        System.out.println("Giỏ hàng:");

        for (int i = 0; i < carts.size(); i++) {
            String product = products.get(carts.get(i));
            Integer price = prices.get(carts.get(i));
            Integer quantity = quantities.get(i);
            System.out.println(String.format("%d. %s x %d = %d", i + 1, product, quantity, quantity * price));
        }

    }
}
