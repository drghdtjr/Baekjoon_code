package String_7;

import java.util.Scanner;

public class String5_1157 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word= sc.next();
        int []arr=new int [26];
        for(int i=0; i<word.length();i++){
            if('A'<=word.charAt(i)&&word.charAt(i)<='Z'){
                arr[word.charAt(i)-'A']++;

            }
            else{
                arr[word.charAt(i)-'a']++;

            }
        }
        int max=-1;
        char ch='?';

        for(int i=0; i<26;i++){
            if(arr[i]>max){
                max=arr[i];
                ch=(char)(i+65);

            }
            else if (arr[i]==max){
                ch='?';

            }
        }

        System.out.println(ch);


    }
}
