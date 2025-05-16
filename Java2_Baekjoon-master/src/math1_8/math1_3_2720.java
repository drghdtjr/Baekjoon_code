package math1_8;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class math1_3_2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        int qu = 0;
        int di = 0;
        int ni = 0;
        int pe = 0;
        while (i < t) {
            int c = sc.nextInt();
            qu = c / 25;
            di = (c % 25) / 10;
            ni = ((c % 25) % 10) / 5;
            pe = ((c % 25) % 10) % 5;
            System.out.println(qu + " " + di + " " + ni + " " + pe);
            i++;
        }
    }
}






