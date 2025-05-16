package bark_0x01;

import java.util.Arrays;
import java.util.Scanner;

public class bark_4_2309 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int arr[]=new int[9];
        int sum=0;
        while(i<9){
            arr[i]= sc.nextInt();
            sum+=arr[i];
            i++;
        }
        int k=0;
        while(k<8){
            int s=k+1;
            while(s<9){
                if(sum-arr[k]-arr[s]==100){
                    arr[k]=0;
                    arr[s]=0;
                    Arrays.sort(arr);
                    int p=2;
                    while(p<9){
                        System.out.println(arr[p]);
                        p++;
                    }
                    return;
                }
                s++;
            }
            k++;
        }
    }
}
