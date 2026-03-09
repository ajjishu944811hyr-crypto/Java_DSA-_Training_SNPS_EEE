package Home.basics.arrays;
//Varags --> for an array (it internally usses arrays)
public class E7 {
   public static void display(int[] arr){ // we can also write {int[] = int...}
       for(int n : arr){
           System.out.print(n + " ");
       }
       System.out.println();
   }

    public static void main(String[] args) {
        int[] array = {0,9,1,4,7,8};
        display(array);
    }
}
