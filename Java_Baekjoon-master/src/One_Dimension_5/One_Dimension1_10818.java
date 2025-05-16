package One_Dimension_5;

import java.util.Arrays;
import java.util.Scanner;

public class One_Dimension1_10818 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[]num=new int[n];
        for(int i=0; i<n;i++){
            num[i]= sc.nextInt();
        }
        Arrays.sort(num);

        System.out.print((num[0])+" "+num[num.length-1]);
    }
}
