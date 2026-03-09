package Home.basics.arrays;

public class E5 {
    //How to pass an array to a method(function)
    public static void printArray(int[] arr){
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static int[] createArray(){  // will return an array of the integer
        return new int[]{7,1,-2,-4,5}; //new array is created & returned
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr);
        int[] result = createArray();// result--> 7,1,-2,-4,5
        for(int num: result){
            System.out.print(num + " ");
        }
        System.out.println();

        printArray(new int[]{10,20,30,40,50});
        //this type is called Anonymous array --> it is directly passed in method call()
        //After the method call, we canot access the array elements
    }
}
