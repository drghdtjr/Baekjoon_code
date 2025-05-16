package Note;

import java.util.Scanner;

public class note_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int [n];
        int m= sc.nextInt();
        int a=0;
        while(a<m){
            int i= sc.nextInt();
            int j= sc.nextInt();
            int k= sc.nextInt();
            int p= i-1;
            while(p<j){
                arr[p]=k;
                p++;
            }
            a++;

        }
        int s=0;
        while(s< arr.length){
            System.out.print(arr[s]+" ");
            s++;
        }
    }
}
