package oneArrange_4;

import java.util.Scanner;

public class one_1_10807 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        int j=0;
        int count=0;
        int[] arr=new int[n];
        while(i<n){
            arr[i]=sc.nextInt();
            i++;
        }
        int a= sc.nextInt();
        while(j< arr.length){
            if(a==arr[j]){
                count++;
            }
            j++;
        }
        System.out.println(count);
    }
}
