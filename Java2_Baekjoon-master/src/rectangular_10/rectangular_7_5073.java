package rectangular_10;

import java.util.Arrays;
import java.util.Scanner;

public class rectangular_7_5073 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        while (true) {
            int i = 0;
            while (i < 3) {
                arr[i] = sc.nextInt();
                i++;
            }
            Arrays.sort(arr);
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }
            if (arr[2] >= arr[0] + arr[1]) {
                System.out.println("Invalid");
            } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
                System.out.println("Equilateral");
            } else if (arr[0]!=arr[1]&&arr[1]!=arr[2]&&arr[2]!=arr[0]) {
                System.out.println("Scalene");
            }
            else{
                System.out.println("Isosceles");
            }

        }
    }
}
