package bark_0x01;

import java.util.Scanner;

public class bark_6_10804 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [20];
        for(int i=0;i<20;i++){
            arr[i]=i+1;
        }
        int i=0;
        while(i<10) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int j = 0;
            int s = (b - a + 1) / 2;
            while (j < s) {
                int tmp = arr[a - 1];
                arr[a - 1] = arr[b - 1];
                arr[b - 1] = tmp;
                a++;
                b--;
                j++;
            }
            i++;
        }
        for(int k=0;k<20;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
