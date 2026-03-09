package Home.basics.arrays;

public class E2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[1]); //o/p is 2
        arr[1] = 400;
        System.out.println(arr[1]);
        // o/p is 400 cause we can do this in constant time beacuse of the index
        // So - the time complexity is Big O(1)
        // Accessing & Updating elements in array -> TC O(1)
        // This is beacause of index based access or
        // direct index mapping
        //[idx = pas - 1] ; [pas = idx + 1]

        //array.length is not a method its just a property
        for(int i=0 ; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //for each loop also called enhanced for loop
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();

        // parent class of java is object
        for(Object  o : arr){
            System.out.println(o + " ");
        }
        System.out.println();

        String name = "SNPSU";
        // String.length() is a method of the String class
        System.out.println(name);
    }
}
