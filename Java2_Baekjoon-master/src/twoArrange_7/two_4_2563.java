package twoArrange_7;

import java.util.Scanner;

public class two_4_2563 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [][]arr=new int [100][100];
        int i=0;
        int x,y=0;
        int count=0;
        while(i<n){
            x= sc.nextInt();
            y= sc.nextInt();
            int j=x;
            while(j<x+10){
                int k=y;
                while(k<y+10){
                    arr[j][k]=1;
                    k++;
                }
                j++;
            }
            i++;

        }
        int z=0;
        while(z< arr.length){
            int k=0;
            while(k<arr[i].length){
                if(arr[z][k]==1){
                    count+=arr[z][k];
                }
                k++;
            }
            z++;
        }
        System.out.println(count);






    }
}

