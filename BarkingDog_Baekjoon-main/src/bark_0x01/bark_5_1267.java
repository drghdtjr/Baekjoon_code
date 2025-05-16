package bark_0x01;

import java.util.Scanner;

public class bark_5_1267 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        int sum_y=0;
        int sum_d=0;
        while(i<n){
            int min= sc.nextInt();
            sum_y+=young(min);
            sum_d+=minsik(min);
            i++;
        }
        if(sum_y<sum_d){
            System.out.println("Y"+" "+sum_y);
        }
        else if(sum_y==sum_d){
            System.out.println("Y M"+" "+sum_y);
        }
        else{
            System.out.println("M"+" "+sum_d);
        }
    }
    public static int young(int time) {
        // 영식이는 30초마다 10원
        return ((time / 30) + 1) * 10;
    }

    public static int minsik(int time) {
        // 민식이는 60초마다 15원, 미만의 경우도 고려
        return ((time / 60) + 1) * 15;
    }
}

