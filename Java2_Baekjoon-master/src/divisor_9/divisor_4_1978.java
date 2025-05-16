package divisor_9;

import java.util.Scanner;

public class divisor_4_1978 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        int count=0;
        while(i<n){
            int s= sc.nextInt();
            int j=2;
            while(j<=s){
                if(j==s){
                    count++;
                }
                if(s%j==0){
                    break;
                }
                j++;
            }
            i++;

        }
        System.out.println(count);
    }
}
