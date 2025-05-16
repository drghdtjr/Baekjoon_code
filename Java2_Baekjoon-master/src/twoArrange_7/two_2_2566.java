package twoArrange_7;

import java.util.Scanner;

public class two_2_2566 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int [9][9];
        int i=0;
        int max=0;
        while(i< 9){
            int j=0;
            while(j<9){
                arr[i][j]=sc.nextInt();
                j++;
            }
            i++;

        }
        int k=0;
        int row=0;
        int col=0;
        while(k<9){
            int x=0;
            while(x<9){
                if(arr[k][x]>max){
                    max=arr[k][x];
                    row=k;
                    col=x;
                }
                x++;
            }
            k++;
        }
        System.out.println(max);
        System.out.println((row+1)+" "+(col+1));

    }
}
