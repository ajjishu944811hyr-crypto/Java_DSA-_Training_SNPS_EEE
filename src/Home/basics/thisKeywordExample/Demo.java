package Home.basics.thisKeywordExample;

public class Demo {
    //Instance Variable
    String i;
    void change(String x){
        this.i = x;

    }
    void display(){
        System.out.println("The value of i is : " + i);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.change("Demo");
        obj.display();
    }
}
