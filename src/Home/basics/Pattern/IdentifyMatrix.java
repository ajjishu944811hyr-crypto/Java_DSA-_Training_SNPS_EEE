package Home.basics.Pattern;

public class IdentifyMatrix {
    static void identifyMatrix(int n){
        for (int r =1; r<=n; r++){
            for(int c =1; c<=n;c++){
                if(r == c){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        identifyMatrix(5);
    }
}
