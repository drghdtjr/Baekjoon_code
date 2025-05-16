package Note;

import java.util.Scanner;

public class note_new_11 {
    public static void main(String[] args) {
        //단리
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        String []arr_n=new String[n];
        String []arr_m=new String[m];
        for(int i=0;i<n;i++){
            arr_n[i]= sc.next();
        }
        for(int i=0;i<m;i++){
            arr_m[i]= sc.next();
        }
        int i=0;
        int count=0;
        while(i<n){
            int j=0;
            while(j<m){
                if(arr_n[i].equals(arr_m[j])){
                    count++;
                    break;
                }
                j++;
            }
            i++;
        }
        System.out.println(count);


    }
}
