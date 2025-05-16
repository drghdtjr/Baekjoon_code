package brute_12;

import java.util.Scanner;

public class brute_6_2839 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        int count=0;
        while(true){
            if(n%5==0){
                count=count+n/5;
                System.out.println(count);
                break;
            }
            else if(n<3){
                System.out.println("-1");
            }
            n=n-3;
            count++;

        }
    }

}
