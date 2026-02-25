package Home.basics.conditionalStatements;

import java.util.Scanner;

public class EvenOddWithoutModules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        if ((n & 1) == 0){
            System.out.println(n + " is Even");

        }
        else{
            System.out.println(n + " is Odd");
        }
    }
}
