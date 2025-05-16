package sort_13;

import java.util.Arrays;
import java.util.Scanner;

public class sort_7_11650 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        int [][]arr=new int [n][2];
        while(i<n){
            arr[i][0]= sc.nextInt();
            arr[i][1]= sc.nextInt();
            i++;
        }
        Arrays.sort(arr,(e1,e2)->{
            if(e1[0]==e2[0]){
                return e1[1]-e2[1];
            }
            else{
                return e1[0]-e2[0];
            }
        });
        int k=0;
        while(k<n){
            System.out.println(arr[k][0]+" "+arr[k][1]);
            k++;
        }



    }
}
