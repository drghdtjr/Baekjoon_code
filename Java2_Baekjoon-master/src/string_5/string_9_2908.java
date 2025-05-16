package string_5;

import java.util.Scanner;

public class string_9_2908 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int new_a=(a/100)+((a%100)/10)*10+(a%100)%10*100;
        int new_b=(b/100)+((b%100)/10)*10+(b%100)%10*100;
        if(new_a>new_b){
            System.out.println(new_a);
        }
        else{
            System.out.println(new_b);
        }
    }
}
