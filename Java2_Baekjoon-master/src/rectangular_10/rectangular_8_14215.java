package rectangular_10;

import java.util.Arrays;
import java.util.Scanner;

public class rectangular_8_14215 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        int i=0;
        while(i<3){
            arr[i]= sc.nextInt();
            i++;
        }
        Arrays.sort(arr);
        if(arr[2]>=arr[0]+arr[1]){

            System.out.println((arr[0]+arr[1])*2-1);
        }
        else{
            System.out.println(arr[0]+arr[1]+arr[2]);
        }
    }
}
