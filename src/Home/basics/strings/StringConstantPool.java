package Home.basics.strings;

public class StringConstantPool {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        //They have the same Literal Value  "Java"
        // So they point to the same object in Heap
        System.out.println(s1 == s2); // o/p will be true caus they are same object
        String s3 = new String("Java");
        System.out.println(s1 == s3);  // o/p will be False cause they are different object

        System.out.println(s1.equals(s3));//o/p  will be true cause just cheaking the strings are equal or not
    }
}
