package string_5;

import java.util.Scanner;

public class string_3_9086 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i=0;
        while(i<t){
            String st=sc.next();
            System.out.print(st.charAt(0));
            System.out.println(st.charAt(st.length()-1));
            i++;
        }


    }
}
