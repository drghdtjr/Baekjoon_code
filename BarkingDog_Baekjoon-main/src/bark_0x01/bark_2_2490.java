package bark_0x01;

import java.util.Scanner;

public class bark_2_2490 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [4];
        int i=0;

        while(i<3){
            int j=0;
            while(j<4){
                arr[j]= sc.nextInt();
                j++;
            }
            int k=0;
            int sum=0;
            while(k<4){
                sum+=arr[k];
                k++;
            }
            if(sum==0){
                System.out.println("D");
            }
            else if(sum==1){
                System.out.println("C");
            }
            else if(sum==2){
                System.out.println("B");
            }
            else if(sum==3){
                System.out.println("A");
            }
            else if(sum==4){
                System.out.println("E");
            }

            i++;
        }

    }

}
