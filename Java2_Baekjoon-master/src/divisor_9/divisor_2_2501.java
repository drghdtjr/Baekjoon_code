package divisor_9;

import java.util.Scanner;

public class divisor_2_2501 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int i=1;
        int count=0;
        while(i<=n){
            if(n%i==0){
                count++;
            }
            if(count==k){
                System.out.println(i);
                break;
            }
            i++;
        }
        if(count<k){
            System.out.println("0");

        }
    }
}
