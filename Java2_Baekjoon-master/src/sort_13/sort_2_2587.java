package sort_13;

import java.util.Arrays;
import java.util.Scanner;

public class sort_2_2587 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [5];
        int i=0;
        int sum=0;
        while(i<5){
            arr[i]= sc.nextInt();
            sum+=arr[i];
            i++;
        }
        System.out.println(sum/5);
        Arrays.sort(arr);
        System.out.println(arr[2]);

    }
}
