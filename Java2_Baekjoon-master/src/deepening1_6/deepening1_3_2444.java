package deepening1_6;

import java.util.Scanner;

public class deepening1_3_2444 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        while(i<n){
            int j=0;
            while(j<n-i-1){
                System.out.print(" ");
                j++;
            }
            int k=0;
            while(k<2*i+1){
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println();
        }
        int d=0;
        while(d<n-1){
            int j=0;
            while(j<=d){
                System.out.print(" ");
                j++;
            }
            int y=0;
            while(y<2*(n-d)-3){
                System.out.print("*");
                y++;

            }
            d++;
            System.out.println();
        }
    }
}

