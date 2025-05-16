package Math1_8;

import java.util.Scanner;

public class Math2_2292 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count=1;
        int range=2;
        if (n==1){
            System.out.println("1");
        }
        else{
            while(range<=n){
                range=range+(6*count);
                count++;
            }
            System.out.println(count);
        }
    }
}
/*
1(1)=1개
2~7(6)=2개
8~19(12)=3개
20~37(18)=4개
38~61(24)=5개


*/
