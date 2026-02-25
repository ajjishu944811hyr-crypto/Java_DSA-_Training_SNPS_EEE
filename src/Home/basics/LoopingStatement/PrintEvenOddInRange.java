package Home.basics.LoopingStatement;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class PrintEvenOddInRange {
    public static void main(String[] args) {
        System.out.println("Enter the Range: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i  <= n){
            if (i % 2 == 0) {

                System.out.println(i + " Even");

            }
            else{
                System.out.println(i + " Odd");
            }
            i++;
        }
    }
}
