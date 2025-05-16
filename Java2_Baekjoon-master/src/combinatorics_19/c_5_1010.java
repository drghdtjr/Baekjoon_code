package combinatorics_19;

import java.util.Scanner;

public class c_5_1010 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            long n= sc.nextLong();
            long m= sc.nextLong();
            if(n<m){
                long tmp=n;
                n=m;
                m=tmp;
            }
            long s=n-m;
            System.out.println(fact(n)/(fact(s)*fact(m)));
        }

    }
    public static long fact(long x){
        if(x<=1){
            return 1;
        }
        return x*fact(x-1);
    }
}
