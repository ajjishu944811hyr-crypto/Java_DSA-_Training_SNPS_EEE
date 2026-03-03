package Home.basics.Oops.inheritance.single;

public class Employee {
    int id;
    String name;
    Employee(int id ,String name) {
        this.name = name;
        this.id = id;
    }
}
class Lecturer extends Employee{
    String Subject;
    Lecturer(int id, String name , String Subject) {
        super(id, name);
        this.Subject = Subject;
    }
    void details(){
        System.out.println(id + " " + name + " " + Subject);
    }

    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer(100,"Rajeev","SNPS");
        lecturer.details();
    }
}

