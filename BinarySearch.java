import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    public static int search(int[] arr,int match) {
        int low = 0;
        int high = arr.length -1;

        while(low <= high) {
//            System.out.println("low="+low+" ;;; high="+high);
            int midPosition = low + (high-low)/2;
            int midElement = arr[midPosition];
//            System.out.println("midPosition="+midPosition);

            if(match == midElement) {
//                System.out.println("midElement found: "+midElement);
                return midPosition;
            }
            if(match<midElement) {
                high = midPosition -1;
//                System.out.println("New high="+high);
            }else {
                low = midPosition +1;
//                System.out.println("New low="+low);
            }
        }
//        System.out.println("Outside while loop");
        return -1;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] a1 = new int[100000];
        for(int i=0;i<a1.length;i++) {
            a1 [i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(a1));
        SelectionSort.sort(a1);
        long start = System.currentTimeMillis();
        int num = random.nextInt(50);
        System.out.println("To search for "+num);
        System.out.println(search(a1,num));
        long end = System.currentTimeMillis();
    }

}
