package oneArrange_4;

import java.util.Scanner;

public class one_3_10818 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        int i=0;
        int j=0;
        while(i<n){
            arr[i]= sc.nextInt();
            i++;
        }
        int max=arr[0];
        int min=arr[0];
        while (j< arr.length) {
            if(max<=arr[j]){
                max=arr[j];
            }

            if(min>=arr[j]){
                min=arr[j];
            }
            j++;

        }
        System.out.println(min+" "+max);
    }
}
