package oneArrange_4;

import java.util.Scanner;

public class one_6_10813 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int [n]; // 바구니 번호
        int m=sc.nextInt();
        int i=0;
        int temp=0;
        while(i< arr.length){
            arr[i]=i;
            i++;
        }
        int j=0;
        while(j<m){
            int I= sc.nextInt();
            int J= sc.nextInt();
            temp=arr[I-1];
            arr[I-1]=arr[J-1];
            arr[J-1]=temp;

            j++;
        }
        int k=0;
        while(k< arr.length){
            System.out.print(arr[k]+" ");
            k++;
        }

    }
}
