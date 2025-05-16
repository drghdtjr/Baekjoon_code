package bark_0x01;

import java.util.Scanner;

public class bark_3_2576 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        int i=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        boolean hasodd=false;
        while(i<7){
            arr[i]= sc.nextInt();
            if(arr[i]%2!=0){
                hasodd=true;
                sum+=arr[i];
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            i++;
        }
        if(hasodd){
            System.out.println(sum);
            System.out.println(min);
        }
        else{
            System.out.println("-1");
        }
    }
}
