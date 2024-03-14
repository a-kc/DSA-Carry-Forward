import java.util.Scanner;

/**
 * Created by AN!KET CHAUHAN
 */
public class Main {
    public static void main(String[] args) {
        // count pairs 'ag'

        // Given a character array of length N, calculate number of pairs indices (i,j) such that
        // i < j && ch[i] == 'a' && ch[j] == 'g'

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        char[] arr = new char[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.next().charAt(arr[i]);
        }

        System.out.println(arr);

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == 'a' && arr[j] == 'g') {
                    count++;
                }
            }
        }

        System.out.println(count);

        // TC : O(N^2)
        // SC : O(1)
// ************************************************** //
        // Optimized solution
        // using carry forward technique

        int pair = 0;
        int cg = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 'g') {
                cg++;
            } else if (arr[i] == 'a') {
                pair = pair + cg;
            }
        }

        System.out.println(pair);

        // TC : O(N)
        // SC : O(1)
    }
}