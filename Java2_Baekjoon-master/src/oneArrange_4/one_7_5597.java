package oneArrange_4;

import java.util.Scanner;

public class one_7_5597 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[31];
        int i=1;
        while(i<=28) {
            int success=sc.nextInt();
            arr[success]=1;
            i++;
        }
        int j=1;
        while(j< arr.length){
            if(arr[j]!=1){
                System.out.println(j);
            }
            j++;
        }

    }
}
