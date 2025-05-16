package IF_2;

import java.util.Scanner;

public class if_6_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int value = sc.nextInt();

        int value_h=value/60;
        int value_m=value%60;
        h=h+value_h;
        m=m+value_m;
        if(m>=60){
            h=h+1;
            m=m-60;
        }
        if(h>=24){
            h=h-24;
        }
        System.out.println(h+" "+m);


    }
}
