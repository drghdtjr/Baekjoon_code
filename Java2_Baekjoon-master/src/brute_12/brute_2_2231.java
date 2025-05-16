package brute_12;

import java.util.Scanner;

public class brute_2_2231 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        int m=1;
        int result=0;
        while(i<n){
            int number=i;
            int sum=0;
            while(number!=0){
                sum+=number%10;
                number=number/10;
            }
            if(sum+i==n){
                result=i;
                break;
            }
            i++;
        }
        System.out.println(result);
    }
}
