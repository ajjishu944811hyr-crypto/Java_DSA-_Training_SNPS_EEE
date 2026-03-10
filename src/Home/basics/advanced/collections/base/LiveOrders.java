package Home.basics.advanced.collections.base;

import java.util.ArrayList;
import java.util.Collection;

public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveOrders = new ArrayList<>();
        liveOrders.add("ORD101");
        liveOrders.add("ORD102");
        liveOrders.add("ORD103");
        //check the order
        System.out.println("ORD101 IS AVAILABLE?: " +
                liveOrders.contains("ORD101"));
        //to check all the orders
        System.out.println("Live Orders: " + liveOrders);
        liveOrders.remove("ORD101");
        System.out.println("ORD101 IS AVAILABLE?: " +
                liveOrders.contains("ORD101"));
        System.out.println("Live Orders: " + liveOrders);
        System.out.println("Total live Orders: " + liveOrders.size());
        liveOrders.clear();
        System.out.println("Current live Orders: " + liveOrders);
    }
}
