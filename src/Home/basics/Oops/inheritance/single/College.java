package Home.basics.Oops.inheritance.single;

public class College {
    static  String name = "SNPS";
    String address;
    int pincode;

    public College(String address, int pincode) {
        this.address = address;
        this.pincode = pincode;
    }
}
class Department extends College{
    String Block;
    int lecturerCount;
    Department(String address, int pincode,String Block, int lecturerCount) {
        super(address,pincode);
        this.Block = Block;
        this.lecturerCount = lecturerCount;
    }

    void details(){
        System.out.println(Block + " " + lecturerCount + " " + address
                + " " + pincode + " " + College.name);
    }

    public static void main(String[] args) {
        Department department = new Department("Bangalore", 560057, "A", 15);
        department.details();
    }
}
/*
Points to remember:
❌Don't use super.for constructor
☑️super() -> constructor  of the Parent Class
✅super.Something -> Variable from Parent Class
this are the imp for interviews and vivas
 */
