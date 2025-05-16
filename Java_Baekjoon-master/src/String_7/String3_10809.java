package String_7;

import java.util.Scanner;

public class String3_10809 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int []arr=new int [26];
        for(int i=0; i<arr.length; i++){
            arr[i]=-1;
        }
        for(int i=0; i<s.length();i++){
            int num=s.charAt(i)-97;
            if(arr[num]>=0){
                continue;
            }
            arr[num]=i;

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }

}
