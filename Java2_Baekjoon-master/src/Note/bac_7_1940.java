package Note;

import java.util.Scanner;

public class bac_7_1940 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int []arr=new int [n];
        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        int count=0;
        int i=0;
        while(i<n){
            int j=i+1;
            while(j<n){
                if(arr[i]+arr[j]==m){
                    count++;
                }
                j++;
            }
            i++;
        }
        System.out.println(count);


    }
}
