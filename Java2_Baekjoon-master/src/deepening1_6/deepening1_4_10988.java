package deepening1_6;

import java.util.Scanner;

public class deepening1_4_10988 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        int i=0;
        while(i<st.length()/2){
            char first=st.charAt(i);
            char last=st.charAt(st.length()-1-i);
            if(first!=last){
                System.out.println("0");
                return;
            }
            i++;
        }
        System.out.println("1");
    }
}

