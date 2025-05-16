package sort_13;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class sort_3_25305 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int arr[]=new int [n];
        int i=0;
        while(i<n){
            arr[i]= sc.nextInt();
            i++;
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-k]);

    }
}
