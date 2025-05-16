package while_3;

import java.util.Scanner;

public class while_7_11021 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int x=0;
        while(t>0){
            x++;
            int a= sc.nextInt();
            int b= sc.nextInt();
            System.out.println("Case #"+x+": "+ (a + b) );

            t--;
        }
    }
}
