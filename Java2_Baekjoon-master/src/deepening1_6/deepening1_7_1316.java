package deepening1_6;

import java.util.Scanner;

public class deepening1_7_1316 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        int count=0;
        while(i<n){
            String st=sc.next();
            boolean check[]=new boolean[26];
            boolean tmp=true;
            int j=0;
            while(j<st.length()){
                int index=st.charAt(j)-'a';
                if(check[index]){
                    if(st.charAt(j)!=st.charAt(j-1)){
                        tmp=false;
                        break;
                    }
                }
                else{
                    check[index]=true;
                }
                j++;
            }
            if(tmp){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }

}
