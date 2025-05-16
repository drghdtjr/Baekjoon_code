package string_5;

import java.util.Scanner;

public class string_7_2675 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i=0;
        while(i<t){
            int r= sc.nextInt();
            String s=sc.next();
            int j=0;
            while(j<s.length()){
                int k=0;
                while(k<r){
                    System.out.print(s.charAt(j));
                    k++;
                }


                j++;
            }
            i++;
            System.out.println();
        }
    }
}
