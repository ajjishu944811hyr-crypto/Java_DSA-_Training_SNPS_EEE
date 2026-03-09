package Home.basics.arrays.problems;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for(int num : arr){
            arraySum+=num;

        }
        System.out.println("Array Sum: " + arraySum);
        int MissingNumber = totalSum - arraySum;
        System.out.println("Missing Number: " + MissingNumber);
    }
}
