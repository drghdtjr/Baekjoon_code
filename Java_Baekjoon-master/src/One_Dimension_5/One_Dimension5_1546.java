package One_Dimension_5;

import java.util.Scanner;

public class One_Dimension5_1546 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        int max=0;
        int sum=0;
        double avg=0;
        for(int i=0; i< arr.length; i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
            sum+=arr[i];
        }
        avg=100.0*sum/max/n;
        System.out.println(avg);

    }

}
