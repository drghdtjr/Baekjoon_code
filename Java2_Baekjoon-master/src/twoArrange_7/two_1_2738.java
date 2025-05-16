package twoArrange_7;

import java.util.Scanner;

public class two_1_2738 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int [][]arr1=new int [n][m];
        int [][]arr2=new int [n][m];
        int i=0;
        while(i<n){
            int j=0;
            while(j<m){
                arr1[i][j]=sc.nextInt();
                j++;
            }
            i++;
        }
        int k=0;
        while(k<n){
            int j=0;
            while(j<m){
                arr2[k][j]=sc.nextInt();
                j++;
            }
            k++;
        }
        int z=0;
        while(z<n){
            int j=0;
            while(j<m){
                System.out.print(arr1[z][j]+arr2[z][j]+" ");
                j++;
            }
            System.out.println();
            z++;
        }



    }
}
