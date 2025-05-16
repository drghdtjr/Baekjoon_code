package while_3;

import java.util.Scanner;

public class while_4_25304 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int n= sc.nextInt();
        int num=0;
        while(n>0){
            int a= sc.nextInt();
            int b= sc.nextInt();
            num+=a*b;
            n--;
        }
        if(x==num){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
