package If_2;

import java.util.Scanner;

public class If6_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int value = sc.nextInt();

        minute += value;
        if (minute >= 60) {
            while (minute >= 60) {
                minute -= 60;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }

            }

        }
        System.out.println(hour+" "+minute);
    }
}
