package bark_0x02;

import java.util.Scanner;

public class bark_6_1919 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word_1=sc.next();
        String word_2=sc.next();
        int arr_1[]=new int[26];
        int arr_2[]=new int[26];
        int i=0;
        while(i<word_1.length()){
            int a=word_1.charAt(i)-'a';
            arr_1[a]++;
            i++;
        }
        int j=0;
        while(j<word_2.length()){
            int a=word_2.charAt(j)-'a';
            arr_2[a]++;
            j++;
        }
        int same_alp[]=new int[26];
        int s=0;
        while(s<26){
            if (arr_1[s]>0&&arr_2[s]>0){
                if (arr_1[s] == arr_2[s]){
                    same_alp[s]=arr_1[s];
                }
                else if(arr_1[s]>arr_2[s]){
                    same_alp[s]=arr_2[s];
                }
                else if(arr_1[s]<arr_2[s]){
                    same_alp[s]=arr_1[s];
                }
            }
            s++;
        }
        int z=0;
        int count=0;
        while(z<26){
            count+=arr_1[z]-same_alp[z];
            count+=arr_2[z]-same_alp[z];
            z++;
        }
        System.out.println(count);
    }

}
