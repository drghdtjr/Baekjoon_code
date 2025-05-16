package Note;

import java.util.Scanner;

public class bac_6_2018 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        int count=0;
        while(i<=n){
            int j=i;
            int sum=0;
            while(j<=n){
                sum+=j;
                if(sum>n){
                    break;
                }
                else if(sum==n){
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
