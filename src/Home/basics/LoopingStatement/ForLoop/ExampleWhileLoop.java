package Home.basics.LoopingStatement.ForLoop;

import java.util.Scanner;

public class ExampleWhileLoop {
    public static void main(String[] args) {
        System.out.println("enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =20;
        while(i <=n){
            if(i % 2 ==0){
                System.out.println(i + " is Even");
            }
            else{
                System.out.println(i + " is Odd");
            }
            i++;

        }
    }
}
