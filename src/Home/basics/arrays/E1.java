package Home.basics.arrays;

public class E1 {
    public static void main(String[] args) {
        //Method 1
        int[] arr1; //Declaration
        arr1 = new int[5];//Memory Alloctaion 4 bytes * 5 = 20 bytes
        System.out.println(arr1[4]);
        /*
        if we do not provide any values, the JVM uses "FALLBACK MECHANISM"
        it uses the default values of that particular data type
        int--> 0, float--> 0.0 , string--> null ,bool--> False,char--> null
        // Declaration & Memory Allocation in the single line
         */

        // Method 2
        int[] arr2 = new int[5];
        System.out.println(arr2[4]);

        //Method 3
        int [] arr3 = {2,8,-1,4,6};
        System.out.println(arr3[3]);

        // Method 4
        int[] arr4 = new int[]{8,0,4,1,3};
        System.out.println(arr4[0]);
    }
}
