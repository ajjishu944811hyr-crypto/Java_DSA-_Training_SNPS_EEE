package Home.basics.advanced.collections.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        //Double ennded queue(adding firts and last also)
        Deque<String> actions = new ArrayDeque<>();
        actions.addLast("User type A");
        actions.addLast("User type B");
        actions.addLast("User type C");
        System.out.println("Total actions: " + actions);
        System.out.println("Undo actions: " + actions.removeLast()); // re
        System.out.println("Remaining Actions: " + actions);

    }
}
