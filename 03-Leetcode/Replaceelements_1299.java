import java.util.*;

public class Replaceelements_1299 {

    public static void main(String[] args) {

        int[] arr = {17,18,5,4,6,1};
        int n = arr.length;
        int rightmax = -1;

               for (int i = n - 1; i >= 0; i--) {

            int prev = arr[i];     
            arr[i] = rightmax;    

            rightmax = Math.max(rightmax, prev);
        }
        System.out.println(Arrays.toString(arr));
    }
}
