package math1_8;

import java.util.Scanner;

public class math1_6_1193 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int count=0;
        int n=0;
        while(true){
            n++;
            count+=n;
            if(count>=x){
                if(n%2==0){
                    System.out.println(x-count+n+"/"+(count-x+1));
                }
                else{
                    System.out.println(count-x+1+"/"+(x-count+n));
                }
                break;
            }
        }

    }
}
