package Note;

import java.util.Scanner;

public class bac_5_10986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] s = new long[n];
        long[] c=new long[m];
        long ans=0;
        s[0]= sc.nextInt();
        int i=1;

        while(i<n){
            s[i]= s[i-1]+ sc.nextInt();
            i++;
        }
        int j=0;
        while(j<n){
            int remain=(int)(s[j]%m);
            if(remain==0){
                ans++;
            }

            j++;
        }
        int k=0;
        while(k<m){
            if(c[k]>1){

            }
            k++;
        }

    }
}
