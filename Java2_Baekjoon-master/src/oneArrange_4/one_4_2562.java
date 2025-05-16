package oneArrange_4;

import java.util.Scanner;

public class one_4_2562 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[9];
        int i=0;
        int j=0;
        int max=0;
        int index=0;
        while(i<9){
            arr[i]=sc.nextInt();
            i++;
        }

        while(j< arr.length){

            if(max<=arr[j]){
                max=arr[j];
                index=j+1;
            }
            j++;
        }
        System.out.println(max+"\n"+index);


    }
}
