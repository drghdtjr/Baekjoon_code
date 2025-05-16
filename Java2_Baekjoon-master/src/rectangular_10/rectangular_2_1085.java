package rectangular_10;

import java.util.Scanner;

public class rectangular_2_1085 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int w= sc.nextInt();
        int h= sc.nextInt();
        int w_min=0;
        int h_min=0;
        int min=0;
        if(w-x>x){
            w_min=x;
        }
        else{
            w_min=w-x;
        }
        if(h-y>y){
            h_min=y;
        }
        else{
            h_min=h-y;
        }
        if(h_min>w_min){
            min=w_min;
        }
        else{
            min=h_min;
        }
        System.out.println(min);



    }
}
