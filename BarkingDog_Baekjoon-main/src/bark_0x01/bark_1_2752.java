package bark_0x01;

import java.util.Scanner;

public class bark_1_2752 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [3];
        int i=0;
        while(i<3){
            arr[i]= sc.nextInt();
            i++;
        }
        int k=0;
        while(k<3){
            int j=0;
            while(j<3){
                if(arr[k]<arr[j]){
                    int tmp=arr[k];
                    arr[k]=arr[j];
                    arr[j]=tmp;
                }
                j++;
            }
            k++;
        }
        int s=0;
        while(s<3){
            System.out.print(arr[s]+" ");
            s++;
        }

    }
}
