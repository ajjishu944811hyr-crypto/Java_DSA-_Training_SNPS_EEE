package Home.basics.exception;

public class InvaildException extends  Exception{
    InvaildException(String msg){
        super(msg);
    }
}
class Main{
    static void vote(int age) throws InvaildException{
        if (age < 18){
            throw new InvaildException("Age must be at least 18. ");
        }
        System.out.println("You can Vote!");
    }

    public static void main(String[] args) {
        try{
            vote(12);
        }
        catch (InvaildException e){
            System.out.println(e.getMessage());
        }

    }
}
/*
o/p  -->  Home.basics.exception.InvaildException: Age must be at least 18.

✅its is called Fully classified classname - name of the class along with the folder structure

 */

