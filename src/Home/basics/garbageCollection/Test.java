package Home.basics.garbageCollection;

public class Test {
    @Deprecated
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Obeject destroyed");

    }

    public static void main(String[] args) {  // eventhough 100 times print in for loop its printing only one time
        Test t = new Test();
        t = null;
        for(int i = 1;i<100; i++){
            System.gc();
        }
    }
}
// Now-a-days all clutter is auto-cleared after exception by JVM
