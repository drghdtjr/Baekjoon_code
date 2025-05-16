package brute_12;

import java.util.Scanner;

public class brute_3_19532 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int e= sc.nextInt();
        int f= sc.nextInt();
        int i=-999;
        while(i<1000){
            int j=-999;
            while(j<1000){
                if(a*i+b*j==c&&d*j+e*j==f){
                    System.out.println(i+" "+j);
                }
                j++;
            }
            i++;
        }
    }
}
