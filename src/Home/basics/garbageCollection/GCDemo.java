package Home.basics.garbageCollection;

public class GCDemo {
    public static void main(String[] args) {
        GCDemo obj = new GCDemo();
        obj = null;
        System.gc();
        /*
        Now a days the gc() method is automatically called after program
        exception by the object ,,,,,
         */


    }


}
