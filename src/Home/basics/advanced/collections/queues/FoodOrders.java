package Home.basics.advanced.collections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    public static void main(String[] args) {
        Queue<String>  orders = new LinkedList<>();
        //For adding element if we want strict type --->> [add]
        // For adding elements if we want not strict like lineant ---->> [offer]
        orders.add("order101");
        orders.offer("order102");
        orders.offer("order103");
        System.out.println("orders: " + orders);
        //For removing elements [remove][strict] [poll][lenient]
        orders.remove();
        System.out.println("Orders: " + orders);
        orders.poll();
        System.out.println("Orders: " + orders);
    }
}
