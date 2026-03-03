package Home.basics.staticKeyword;

public class Example {
    //static belongs to the Stack Memory.
    //No objects needed for it
    // The static block executes with the class before main()
    static int x = 2;
    static{
        System.out.println("Open the System.");
    }
    public static void main(String[] args) {
        System.out.println("SNPSU-ECE-EEE-2027");
        System.out.println(x);
    }
    static{
        System.out.println("Start the app.");
        System.out.println("gfc");
    }
}

/// static print first or static block print first then after main() wiil print
