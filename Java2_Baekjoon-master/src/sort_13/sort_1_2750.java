package sort_13;

import java.util.Arrays;
import java.util.Scanner;

public class sort_1_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i = 0;
        while (i < n) {
            arr[i] = sc.nextInt();
            i++;
        }
        int k = 0;

        while (k < n) {
            int j = k + 1;
            while (j < n) {
                if(arr[k]>arr[j]) {
                    int tmp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = tmp;
                }
                j++;
            }
            k++;
        }
        int s=0;
        while(s<n){
            System.out.println(arr[s]);
            s++;
        }
    }
}

