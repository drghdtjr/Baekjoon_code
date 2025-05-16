//다이아몬드

package Note;

import java.util.Scanner;

public class note_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //상단
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            int x = 1;
            while (x <= i * 2 - 1) {
                System.out.print("*");
                x++;
            }
            System.out.println();
            i++;
        }
        //하단
        int j=1;
        while(j<n){
            int k=1;
            while(k<=j){
                System.out.print(" ");
                k++;
            }
            int d=0;
            while(d<2*(n-j)-1){
                System.out.print("*");
                d++;
            }
            System.out.println();
            j++;
        }
    }
}


