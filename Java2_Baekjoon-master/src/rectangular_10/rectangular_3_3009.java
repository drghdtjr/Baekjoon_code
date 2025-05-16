package rectangular_10;

import java.util.Scanner;

public class rectangular_3_3009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x_1= sc.nextInt();
        int y_1= sc.nextInt();
        int x_2= sc.nextInt();
        int y_2= sc.nextInt();
        int x_3= sc.nextInt();
        int y_3= sc.nextInt();
        int x=0;
        int y=0;
        if(x_1==x_2){
            x=x_3;
        }
        else if(x_1==x_3){
            x=x_2;
        }
        else {
            x = x_1;
        }

        if(y_1==y_2){
            y=y_3;
        }
        else if(y_1==y_3){
            y=y_2;
        }
        else {
            y = y_1;
        }
        System.out.println((x+" "+y));

    }
}
