package Math1_8;

import java.util.Scanner;

public class Math3_1193 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int cnt=0;
        int n=0;
        while(true){
            n++;
            cnt+=n;
            if(cnt>=x){
                if(n%2==0){
                    System.out.println(x-cnt+n+"/"+(cnt-x+1));

                }
                else{
                    System.out.println((cnt-x+1)+"/"+(x-cnt+n));
                }
                break;

            }
        }
    }
}
