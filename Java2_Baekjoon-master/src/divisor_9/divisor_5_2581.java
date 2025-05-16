package divisor_9;

import java.util.Scanner;

public class divisor_5_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[]=new int [n+1];
        int min=n;
        int sum=0;
        int s=0;
        while(s< arr.length){
            arr[s]=0;
            s++;
        }
        while(m<=n){
            if(prime(m)){
                sum+=m;
                arr[m]=m;

            }
            m++;
        }
        int k=0;
        while(k< arr.length){
            if(arr[k]<min&&arr[k]>0){
                min=arr[k];
            }
            k++;
        }
        if(sum==0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }

    }
    static boolean prime (int i){
        if(i<2){
            return false;
        }
        int j=2;
        while(j<i){
            if(i%j==0){
                return  false;
            }
            j++;
        }
        return true;
    }
}
