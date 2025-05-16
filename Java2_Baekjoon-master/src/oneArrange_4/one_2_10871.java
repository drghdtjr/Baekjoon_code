package oneArrange_4;

import java.util.Scanner;

public class one_2_10871 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int x= sc.nextInt();
        int arr[]=new int[n];
        int i=0;
        int j=0;
        while(i<n){
            arr[i]= sc.nextInt();
            i++;
        }
        while(j< arr.length){
            if(x>arr[j]){
                System.out.print(arr[j]+" ");
            }
            j++;
        }

    }
}
