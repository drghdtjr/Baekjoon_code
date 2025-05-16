package bark_0x03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class bark_1_3273 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        int x= sc.nextInt();
        Arrays.sort(arr);

        int left=0;
        int right=n-1;
        int count=0;
        while(left<right) {
            int sum = arr[left] + arr[right];
            if(sum==x){
                count++;
                left++;
                right--;
            }
            else if(sum<x){
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println(count);
    }
}
