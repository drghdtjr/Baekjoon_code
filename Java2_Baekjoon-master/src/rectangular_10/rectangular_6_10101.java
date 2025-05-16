package rectangular_10;

import java.util.Scanner;

public class rectangular_6_10101 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a+b+c==180){
            if(a==60&&b==60&&c==60){
                System.out.println("Equilateral");
            }
            else if((a==b&&b!=c)||(b==c&&c!=a)||(c==a&&a!=b)){
                System.out.println("Isosceles");
            }
            else{
                System.out.println("Scalene");
            }
        }
        else{
            System.out.println("Error");
        }
    }
}
