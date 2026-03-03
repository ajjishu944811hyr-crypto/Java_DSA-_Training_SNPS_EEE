package Home.basics.garbageCollection;

public class GCExample1 {
    public static void main(String[] args) {
      String s1 = new String("Java");
      String s2 = new String("Python");
      s1 = s2;
      //System.gc(); // we can write also correct not also correct
      //we wrote this in previous versions
        //Now , it is not mandatory
        //Now, int the SCP --> "Java" is not available
        //This proves that garbage collection is Automatic
        // Any unused data is cleared = Garbage Collection

        System.out.println(s1);
    }

}
