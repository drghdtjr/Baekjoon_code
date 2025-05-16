package Note;

import java.util.Scanner;

public class note_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        while(i<n){
            int k=n-i;
            int j=1;
            while(j<k){

                System.out.print(" ");
                j++;
            }
            int x=0;
            while(x<=i){
                System.out.print("*");
            x++;
            }
            System.out.println();
            i++;
        }
    }

}
