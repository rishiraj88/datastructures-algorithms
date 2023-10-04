import java.util.Arrays;

public class SelectionSort {

    static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    // swap the two values:wq

                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] a1 = {1,2,4,6,23,1,3,5};
        System.out.println("Input array: "+ Arrays.toString(a1));
        System.out.println("Sorted array: "+Arrays.toString(sort(a1)) );

    }

}



