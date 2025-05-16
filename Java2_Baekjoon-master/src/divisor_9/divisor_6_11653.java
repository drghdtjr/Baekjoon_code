package divisor_9;

import java.util.Scanner;

public class divisor_6_11653 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=2;
        if(n<2){
            System.out.println();
        }
        while(i<=n){
            if(n%i==0){
                System.out.println(i);
                n/=i;

            }
            else{
                i++;
            }

        }

    }
}
