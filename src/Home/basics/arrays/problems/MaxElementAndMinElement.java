package Home.basics.arrays.problems;

import java.util.Arrays;

public class MaxElementAndMinElement {
    public static void main(String[] args) {
        int[] array = {23,0,-2,41,100,98,6};
        int max = array[0];// we assume the first value as max
        int min = array[0];
        for(int i = 1; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
