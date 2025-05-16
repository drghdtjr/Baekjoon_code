package One_Dimension_5;

import java.util.Scanner;

public class One_Dimension3_2577 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d=a*b*c;
        int []num=new int[10];

        while(d>0){
            num[d%10]++;
            d=d/10;
        }

        for(int i=0;i< num.length;i++)
        {
            System.out.println(num[i]);
        }
    }
}
