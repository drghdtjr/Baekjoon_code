package divisor_9;

import java.util.Scanner;

public class divisor_3_9506 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int n= sc.nextInt();
            if(n==-1){
                break;
            }
            int sum=0;
            int a=0;
            int arr[]=new int [n];
            int i=1;
            while(i<n){
                if(n%i==0){
                    arr[a++]=i;
                    sum+=i;
                }
                i++;
            }
            if(sum!=n){
                System.out.println(n+" is NOT perfect.");
            }
            else {
                System.out.print(n + " = ");

                int k = 0;
                while (k < a) {
                    if(k==a-1){
                        System.out.print(arr[k]);

                    }
                    else{
                        System.out.print(arr[k]+" + ");
                    }
                    k++;
                }
                System.out.println();
            }
        }

    }
}
