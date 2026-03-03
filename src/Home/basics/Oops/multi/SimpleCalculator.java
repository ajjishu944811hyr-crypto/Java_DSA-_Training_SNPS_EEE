package Home.basics.Oops.multi;

public class SimpleCalculator {
    void add(int a, int b) {
        System.out.println( a+b);
   }
   void subtract(int a ,int b){
       System.out.println(a-b);
   }
}
class AdvanceClaculator extends SimpleCalculator{
    void divide(int a , int b){
        System.out.println(a/b);
    }
    void multiply(int a,int b){
        System.out.println(a*b);
    }
}
class SuperAdvanceClaculator extends AdvanceClaculator{
    void square(int x){
        System.out.println(Math.pow(x, 2));
    }
    void cube(int x){
        System.out.println(Math.pow(x, 3));
    }

    public static void main(String[] args) {
        System.out.println("================================================");
        SimpleCalculator c1 = new SimpleCalculator();
        c1.add(1,2);
        c1.subtract(4,5);
        System.out.println("================================================");
        AdvanceClaculator c2 = new AdvanceClaculator();
        c2.add(10,20);
        c2.subtract(100,50);
        c2.multiply(2,8);
        c2.divide(10,5);
        System.out.println("================================================");
        SuperAdvanceClaculator c3 = new SuperAdvanceClaculator();
        c3.add(1,2);
        c3.subtract(4,5);
        c3.multiply(2,3);
        c3.divide(10, 2);
        c3.square(8);
        c3.cube(6);
        System.out.println("================================================");
    }
}
