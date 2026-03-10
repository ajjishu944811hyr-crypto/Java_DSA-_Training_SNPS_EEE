package Home.basics.advanced.dsa.algos.sorting;

import java.util.Arrays;

public class Bubblesort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            for(int j=0; j<n-1 ;j++){ // also
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,2,1,4,6,8,7};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
