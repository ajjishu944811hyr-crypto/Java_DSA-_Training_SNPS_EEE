package Home.basics.exception;

public class E4 {
    static void checkwithdraw(int tb,int amt ){
        final int mb = 2000;
        if( tb - amt < mb){ // 6000 - 3000 < 2000
            throw new RuntimeException("Minimum balence of 2000 must be maitained!");
        }
        System.out.println("Withdrawal is Succesfully");
        System.out.println("Remaining Balance: " + (tb - amt));

    }

    public static void main(String[] args) {
        checkwithdraw(6000,3000);
        checkwithdraw(4000,3000);
    }
}
