package deep2_20;

import java.util.Scanner;

public class d_1_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            if (s < min) {
                min = s;
            }
            if (s > max) {
                max = s;
            }
        }
        System.out.println(min*max);

    }
}
