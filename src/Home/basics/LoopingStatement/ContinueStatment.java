package Home.basics.LoopingStatement;

public class ContinueStatment {
    //the continue statement will skip the current value and goes to the begining of the loop for the next vale.
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            if(i == 3){
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
