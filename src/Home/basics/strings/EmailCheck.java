package Home.basics.strings;

public class EmailCheck {
    public static void main(String[] args) {
        String email1 = "student@gamil.com";
        String email2 = "worker 1_edu";
        if (email1.contains("@") && email1.endsWith(".com")){
            System.out.println("Valid Email");
        }
        else {
            System.out.println("Invalid Email");
        }

        if (email2.contains("@") && email1.endsWith(".com")){
            System.out.println("Valid Email");
        }
        else {
            System.out.println("Invalid Email");
        }

        // finding USN Numbder
        String USN = "1SG23EE005";
        System.out.println(USN.startsWith("1SG"));  // Starts with 1SG  --> True
        System.out.println(USN.startsWith("SG"));   // not starting with SG --> False
    }
}
