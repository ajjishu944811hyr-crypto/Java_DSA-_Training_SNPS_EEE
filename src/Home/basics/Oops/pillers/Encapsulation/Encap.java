package Home.basics.Oops.pillers.Encapsulation;

public class Encap {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        //use of setters
        e1.setId(101);
        e1.setEmail("abc@gmail.com");
        System.out.println(e1.getId());
        System.out.println(e1.getEmail());
    }

}
