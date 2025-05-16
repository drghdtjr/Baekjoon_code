package Note;

import java.util.Scanner;

public class bac_1_11720 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        String st= sc.next();
        int sum=0;
        while(i< n){
            sum+= st.charAt(i)-'0';
            i++;
        }
        System.out.println(sum);
    }
}
