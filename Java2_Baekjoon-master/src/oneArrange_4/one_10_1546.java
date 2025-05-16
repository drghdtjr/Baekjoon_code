package oneArrange_4;

import java.util.Scanner;

public class one_10_1546 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        int a=0;
        while(a<n){
            arr[a]= sc.nextInt();
            a++;
        }
        int i=0;
        int max=0;
        while(i<n){
            if (arr[i]>max) {
                max=arr[i];
            }
            i++;
        }
        int k=0;
        double first_aver=0;
        while(k<n){
            first_aver+=arr[k];
            k++;
        }
        double last_aver=((first_aver)/max*100)/n;
        System.out.println(last_aver);
    }
}
