package math1_8;

import java.util.Scanner;

public class math1_4_2903 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        int cnt=2;
        while(i<n){
            cnt=(cnt*2-1);
            i++;
        }

        System.out.println((cnt*cnt));

    }
}
