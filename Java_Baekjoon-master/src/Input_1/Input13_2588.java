package Input_1;

import java.util.Scanner;

public class Input13_2588 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int b_firstnum=b/100;
        int b_secnum=(b%100)/10;
        int b_lastnum=(b%100)%10;
        System.out.println(a*b_lastnum);
        System.out.println(a*b_secnum);
        System.out.println(a*b_firstnum);
        System.out.println((a*b_firstnum)*100+(a*b_secnum)*10+a*b_lastnum);
    }
}
