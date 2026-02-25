package Home.basics.Oops.Constractor;

public class Students {
    int USN;
    String name;
    int marks;
    static String college = "SNPS";

    Students(int USN, String name , int marks ){
        this.USN = USN;
        this.name = name;
        this.marks = marks;

    }
    void evaluateMarks(){
        if(marks < 45){
            System.out.println(name + " has FAILED");
        }
        else{
            System.out.println(name + " has PASSED");
        }
    }
    void StudentDetails(){
        System.out.println(name + "-" + USN + " - " + marks + "-" + college);
    }


    public static void main(String[] args) {
        // object Creation Syntax ClassName obj = new Class Name;
        Students s1 = new Students(101,"sahana",42);
        Students s2 = new Students(102,"Sinchana", 80);

        s1.evaluateMarks();
        s2.evaluateMarks();
        s1.StudentDetails();
        s2.StudentDetails();
    }
}
