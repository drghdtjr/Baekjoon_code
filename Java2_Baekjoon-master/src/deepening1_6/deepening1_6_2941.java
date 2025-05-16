package deepening1_6;

import java.util.Scanner;

public class deepening1_6_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if(ch=='c' && i < s.length() - 1){
                if(s.charAt(i+1)=='=' || s.charAt(i+1)=='-') {
                    i++;
                }
            }
            if(ch=='d'&&i<s.length()-1){
                if(s.charAt(i+1)=='z'&&i<s.length()-2) {
                    if (s.charAt(i + 2) == '=') {
                        i = i + 2;
                    }
                }
                else if(s.charAt(i+1)=='-'){
                    i++;
                }
            }
            if(ch=='l'&& i<s.length()-1) {
                if (s.charAt(i + 1) == 'j') {
                    i++;
                }
            }
            if(ch=='n'&&i<s.length()-1){
                if(s.charAt(i+1)=='j'){
                    i++;
                }
            } if(ch=='s'&&i<s.length()-1){
                if(s.charAt(i+1)=='='){
                    i++;
                }
            } if(ch=='z'&&i<s.length()-1){
                if(s.charAt(i+1)=='='){
                    i++;
                }
            }
            count++;
            i++;
        }
        System.out.println(count);
    }
}


