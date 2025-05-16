package Note;

import java.util.Scanner;

public class bac_4_11660 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int arr[][]=new int[n+1][n+1];
        int sum[][]=new int [n+1][n+1];
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                arr[i][j]= sc.nextInt();
                sum[i][j]=sum[i][j-1]+sum[i-1][j]-sum[i-1][j-1]+arr[i][j];
                j++;
            }
            i++;
        }
        int s=1;
        while(s<=m){
            int x1= sc.nextInt();
            int y1= sc.nextInt();
            int x2= sc.nextInt();
            int y2= sc.nextInt();
            System.out.println(sum[x2][y2]-sum[x1-1][y2]-sum[x2][y1-1]+sum[x1-1][y1-1]);
            s++;
        }

    }
}
