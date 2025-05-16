package deepening1_6;

import java.util.Scanner;

public class deepening1_2_3003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int king=1;
        int queen=1;
        int look=2;
        int bs=2;
        int night=2;
        int pon=8;

        int n_king=king- sc.nextInt();
        int n_queen=queen- sc.nextInt();
        int n_look=look- sc.nextInt();
        int n_bs=bs- sc.nextInt();
        int n_night=night- sc.nextInt();
        int n_pon=pon- sc.nextInt();

        System.out.print(n_king+" ");
        System.out.print(n_queen+" ");
        System.out.print(n_look+" ");
        System.out.print(n_bs+" ");
        System.out.print(n_night+" ");
        System.out.print(n_pon+" ");



    }
}
