package Home.basics.advanced.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("M5-LAPTOP");
        cart.add("MOUSE");
        cart.add("kEYBOARD");
        //Mouse no longer needed
        cart.remove("MOUSE");
        System.out.println("Latest cart after removal: " + cart );
        cart.set(1, "Mechanical Keyword");
        System.out.println("Latest cart after update: " + cart);
    }
}
