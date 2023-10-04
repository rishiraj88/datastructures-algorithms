import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static int[] sort(int[] arr) {
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
        long start = System.currentTimeMillis();
        System.out.println("Sorted array: "+Arrays.toString(sort(a1)) );
        long end = System.currentTimeMillis();
        System.out.println("Time taken to sort: "+(end-start) +"ms.");

        Random random = new Random();
        a1 = new int[300000];
        for(int i=0;i<a1.length;i++) {
            a1[i] = random.nextInt(100000);
            System.out.println(a1[i]);
        }
        System.out.println("Input array: "+ Arrays.toString(a1));
        start = System.currentTimeMillis();
        System.out.println("Sorted array: "+Arrays.toString(sort(a1)) );
        end = System.currentTimeMillis();
        System.out.println("Time taken to sort: "+(end-start) +"ms.");



    }

}



