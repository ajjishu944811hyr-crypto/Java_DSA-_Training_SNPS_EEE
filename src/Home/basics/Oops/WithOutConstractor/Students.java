package Home.basics.Oops.WithOutConstractor;

public class Students {
    int USN;
    String name;
    int marks;
    void evaluateMarks(){
        if(marks < 45){
            System.out.println(name + " has FAILED");
        }
        else{
            System.out.println(name + " has PASSED");
        }
    }

    public static void main(String[] args) {
        // object Creation Syntax ClassName obj = new Class Name;
        Students s1 = new Students();
        s1.USN = 101;
        s1.name = "Sahana";
        s1.marks = 42;
         Students s2 = new Students();
        s2.USN = 102;
        s2.name = "Sinchana";
        s2.marks = 80;
        s1.evaluateMarks();
        s2.evaluateMarks();
    }
}
