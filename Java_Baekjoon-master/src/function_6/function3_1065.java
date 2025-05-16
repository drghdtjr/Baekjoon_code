package function_6;

import java.util.Scanner;

public class function3_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=one_number(n);
        System.out.println(count);


    }

    public static int one_number(int num) {
        int count = 0;
        if (num < 100) {
            return num;
        }
        else {
            count = 99;
            for (int i = 100; i <= num; i++) {
                int first_num = i / 100;
                int second_num = (i / 10) % 10;
                int last_num = i % 10;

                if ((first_num - second_num) == (second_num - last_num)) {
                    count++;
                }
            }

        }
        return count;

    }

}
