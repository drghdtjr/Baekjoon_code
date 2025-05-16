package oneArrange_4;

import java.util.Scanner;

public class one_9_10811 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int arr[]=new int [n];
        int a=0;
        while(a<n){
            arr[a]=a+1;
            a++;
        }
        int k=0;
        while(k<m){
            int i= sc.nextInt();
            int j= sc.nextInt();
            int temp=0;
            while(i<j){
                temp=arr[i-1];
                arr[i-1]=arr[j-1];
                arr[j-1]=temp;

                i++;
                j--;

            }
            k++;
        }
        int s=0;
        while(s< arr.length){
            System.out.print(arr[s]+" ");
            s++;
        }

    }
}
