package rectangular_10;

import java.util.Scanner;

public class rectangular_4_15894 {
    public static void main(String[] args) {
        /*long beforeTime = System.currentTimeMillis();
        Scanner sc=new Scanner(System.in);
        long n= sc.nextInt();
        if(n==1){
            System.out.println(4);
        }
        else if(n==2){
            System.out.println(8);
        }
        else if(n>=3){
            long i=3;
            long a=1;
            long new_n=8;
            long count=n;
            while(i<=count){
                new_n=new_n+2+i-a;
                a++;
                n++;
                i++;
            }
            System.out.println(new_n);
        }
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime);*/
        Scanner sc=new Scanner(System.in);
        long n= sc.nextInt();
        System.out.println(n*4);
    }
}
