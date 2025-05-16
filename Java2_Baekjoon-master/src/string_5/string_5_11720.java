package string_5;

import java.util.Scanner;

public class string_5_11720 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String st= sc.next();
        int i=0;
        int num=0;
        while(i<n){
            num+=st.charAt(i)-'0';
            i++;
        }
        System.out.println(num);
    }
}
