package rectangular_10;

import java.util.Scanner;

public class rectangular_5_9063 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int n= sc.nextInt();
        int arr_x[]=new int[n];
        int arr_y[]=new int[n];
        while(i<n){
            int x= sc.nextInt();
            int y= sc.nextInt();
            arr_x[i]=x;
            arr_y[i]=y;
            i++;
        }
        int max_x=arr_x[0];
        int max_y=arr_x[0];
        int min_x=arr_x[0];
        int min_y=arr_y[0];

        int k=0;
        while(k<n){
            if(arr_x[k]>max_x){
                max_x=arr_x[k];
            }
            if(arr_y[k]>max_y){
                max_y=arr_y[k];
            }
            if(arr_x[k]<min_x){
                min_x=arr_x[k];
            }
            if(arr_y[k]<min_y){
                min_y=arr_y[k];
            }
            k++;
        }
        System.out.println((max_x-min_x)*(max_y-min_y));

    }

}
