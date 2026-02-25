package Home.basics.mathods;
public class Example2 {
    private static int n;

    static int sumOfNTerms(int n){
        return (n * (n+1)) / 2;
    }
    public static void main(String[] args, int n) {
         int sum  = sumOfNTerms(10);
        System.out.println(sum);
        System.out.println(sumOfNTerms(100));

    }
}
