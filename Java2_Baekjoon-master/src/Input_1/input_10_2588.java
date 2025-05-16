package Input_1;

import java.util.Scanner;

public class input_10_2588 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int first_num=b/100;
        int second_num=(b%100)/10;
        int third_num=(b%100)%10;
        System.out.println(a*third_num);
        System.out.println(a*second_num);
        System.out.println(a*first_num);
        System.out.println(a*b);
    }
}
