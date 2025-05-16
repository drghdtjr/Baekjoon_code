package bark_0x02;

import java.io.*;
import java.util.Scanner;

public class bark_2_11328 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        while(i<n){
            int []alp=new int[26];
            char[]word1=sc.next().toCharArray();
            char[]word2=sc.next().toCharArray();
            for(char ch:word1) alp[ch-97]++;
            for(char ch:word2) alp[ch-97]--;
            boolean flag= true;
            for(int j:alp){
                if(j!=0){
                    flag=false;
                    break;
                }
            }
            System.out.println(flag?"Possible":"Impossible");
            i++;
        }

    }
}
