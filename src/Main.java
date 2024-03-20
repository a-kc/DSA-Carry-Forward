import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AN!KET CHAUHAN
 */
public class Main {

    /*
    *

    Given arr[N], ith element is price of a given stock on ith day return the maximum
    possible profit in at most one transaction.

    * */

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int BSP = arr[n-1];

        int ans = 0;

        for(int i = n-2; i>= 0 ; i--){
            int profit = BSP - arr[i];
            if(arr[i]>BSP){
                BSP = arr[i];
            }
            if(profit>ans){
                ans = profit;
            }
        }

        System.out.println(ans);
    }
}