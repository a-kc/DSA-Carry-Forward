import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AN!KET CHAUHAN
 */
public class Main {
    public static void main(String[] args) {

        // Given an array of length N, you have to find number of leader.

        // note 1 - aar[i] is said to be a leader if it is greater than max of all elements on its left [0,i-1]
        // not 2 arr[0] is leader

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            if (arr[i] > max) {
                System.out.println(arr[i]);
                ans++;
            }
        }

        System.out.println(ans);

        // TC : O(N^2)
        // SC : O(1)

        int maxE = arr[0];
        int total = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxE) {
                total++;
                System.out.println(maxE);
                maxE = arr[i];
            }
        }

        System.out.println(total);

        // TC : O(N)
        // SC = O(1)

    }
}