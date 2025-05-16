package Note;

import java.util.Scanner;

public class note_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[31];
        int p=1;
        while(p<=28){
            int n= sc.nextInt();
            int q=1;
            while(q<=30){
                if(q==n){
                    arr[q]=1;
                }
                q++;
            }
            p++;
        }
        int r=1;
        while(r<arr.length){
            if(arr[r]!=1){
                System.out.println(r);
            }
            r++;
        }
    }
}
