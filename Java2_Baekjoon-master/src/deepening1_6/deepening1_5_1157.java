package deepening1_6;

import java.util.Scanner;

public class deepening1_5_1157 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st= sc.next();
        int []arr=new int [26];
        int i=0;
        while(i<st.length()){
            if('A'<= st.charAt(i)&&st.charAt(i)<='Z'){
                arr[st.charAt(i)-'A']++;

            }
            else{
                arr[st.charAt(i)-'a']++;
            }
            i++;

        }
        int j=0;
        int max=-1;
        char ch='?';
        while(j<26){
            if(arr[j]>max) {
                max = arr[j];
                ch=(char)(j+65);
            }
            else if (arr[j]==max){
                ch='?';
            }
            j++;
        }
        System.out.println(ch);
    }
}

