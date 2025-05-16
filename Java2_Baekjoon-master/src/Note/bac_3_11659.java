package Note;

import java.util.Scanner;

public class bac_3_11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n + 1];
        int i = 1;
        while (i <= n) {
            arr[0] = 0;
            arr[i] = arr[i - 1] + sc.nextInt();
            i++;
        }
        int k = 0;
        while(k<m){
            int a= sc.nextInt();
            int b= sc.nextInt();
            System.out.println(arr[b]-arr[a-1]);
            k++;
        }


    }
}


