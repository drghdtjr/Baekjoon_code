package brute_12;

import java.util.Scanner;

public class brute_1_2798 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int arr_n[]=new int[n];
        int i=0;
        while(i<n){
            arr_n[i]=sc.nextInt();
            i++;
        }
        int j=0;
        int result=0;
        int sum=0;
        while(j<n){
            int k=j+1;
            while(k<n){
                int s=k+1;
                while(s<n){
                    sum=arr_n[j]+arr_n[k]+arr_n[s];
                    if(result<sum&&sum<=m){
                        result=sum;
                    }
                    s++;
                }
                k++;
            }
            j++;
        }
        System.out.println(result);

    }
}
