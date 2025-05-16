package One_Dimension_5;

import java.util.Scanner;

public class One_Dimension7_4344 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c= sc.nextInt();
        int []arr;
        for(int i=0; i<c;i++){
            int n= sc.nextInt();
            arr=new int[n];
            int sum=0;
            for(int j=0;j<n;j++){
                int point=sc.nextInt();
                arr[j]=point;
                sum+=point;
            }
            double avg=(double) sum/n;
            double cnt=0;
            for(int j=0; j<n;j++){
                if(arr[j]>avg){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",cnt / n * 100);
        }

    }
}
