package String_7;

import java.util.Scanner;

public class String7_2908 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= reverse_num(sc.nextInt());
        int b=reverse_num(sc.nextInt());
        System.out.println(a>b?a:b);



    }
    public static int reverse_num(int a){
        a = ((a % 10) * 100) + (((a % 100) / 10) * 10) + (a / 100);
        return a;
    }

}
