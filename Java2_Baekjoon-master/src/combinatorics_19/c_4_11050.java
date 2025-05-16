package combinatorics_19;

import java.util.Scanner;

public class c_4_11050 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int s=n-k;
        System.out.println(fact(n)/(fact(s)*fact(k)));

    }
    public static int fact(int a){
        if(a<=1){
            return 1;
        }
        return a*fact(a-1);
    }
}
