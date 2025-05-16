package IF_2;

import java.util.Scanner;

public class if_5_2884 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(b<45){
            a=a-1;
            b=b+15;
            if(a<0){
                a=23;
            }
            System.out.println(a+" "+b);


        }
        else
        {
            System.out.println(a+" "+ (b - 45));
        }


    }


}


