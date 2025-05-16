package Note;

import java.util.Scanner;

public class bac_2_1546 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        int i=0;
        while(i<n){
            arr[i]= sc.nextInt();
            i++;
        }
        int s=0;
        int max=0;
        while(s< arr.length){
            if(arr[s]>max){
                max=arr[s];
            }
            s++;
        }
        int k=0;
        double sum=0;
        while(k< arr.length){
            sum+=arr[k];
            k++;
        }
        System.out.println((sum/max*100)/n);
    }
}
