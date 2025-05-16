package math1_8;

import java.util.Scanner;

public class math1_1_2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int b = sc.nextInt();
        int result = 0;
        int i = 0;
        while (i < n.length()) {
            if (n.charAt(i) >= '0' && n.charAt(i) <= '9') {
                result = result * b + (n.charAt(i) - '0');
            } else {
                result = result * b + (n.charAt(i) - 'A' + 10);
            }
            i++;
        }
        System.out.println(result);

    }
}

