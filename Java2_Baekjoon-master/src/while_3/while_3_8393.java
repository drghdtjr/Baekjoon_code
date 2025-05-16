package while_3;

import java.util.Scanner;

public class while_3_8393 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        while(n>0){
            x=n+x;
            n--;
        }
        System.out.println(x);

    }
}
