package Home.basics.strings;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Tripillar Sloutions";
        System.out.println("Lenght: " + str.length());
        System.out.println("Char at index2: " +
                str.charAt(2));
        System.out.println("char at last index: " +
                str.charAt(str.length() -1));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring: " + str.substring(0,11));
        System.out.println("Equals(Tripillar Sloutions): " +
                str.equals("Tripillar Sloutions"));
        System.out.println("Equals(Case Doesn't Matters):" +           // in this focus on only string not upper or lower case
                str.equalsIgnoreCase("tripillar sloutions"));

        String jumbled = "Ajay1Is1From1EEE1Sec1A";

        String[] words = jumbled.split("1");
        System.out.println(words[0]);

        String name = "    Ajay S     ";
        System.out.println(name.trim()); /// Remove Spaces from Starting andEnding

        char[] letters = {'A','j','a','y'};
        //how do u convert to string imp in interview
       // String word = letters.toString();// not correct
        String word = new String(letters);//using constructor -Wrapper
        System.out.println(word);
    }
}
