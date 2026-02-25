package Home.basics.Pattern;

public class Example1 {
    static void righttringle(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        }
        static void rightt_ringle ( int n){
            for (int r = 1; r <= n; r++) {
                for (int c = 1; c <= r; c++) {
                    System.out.print(c + " ");

                }
                System.out.println();
            }




    }
        public static void main (String[]args){
            righttringle(5);
            rightt_ringle(5);
        }
    }
