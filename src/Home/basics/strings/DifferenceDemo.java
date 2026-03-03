package Home.basics.strings;

public class DifferenceDemo {
    public static void main(String[] args) {
        String s = "Java";
        // hashcode --> uniquec id or number given by Java
        System.out.println("String before: " +
                s.hashCode());
        s = s + " DSA";
        System.out.println("String after: " +
                s.hashCode());
        // this prove that string are IMMUTABLE
        // This is bad cause it creats different hashcode we donot able to add 2 object


        // we have the MUTABLE thing
        //so we use StringBuilder as constructor and for adding new word(DSA) we use builder.append

        StringBuilder bulider = new StringBuilder("Java");
        System.out.println("Bulider before: " + bulider.hashCode());
        bulider.append(" DSA");
        System.out.println("Builder after: " + bulider.hashCode());

    }
}
