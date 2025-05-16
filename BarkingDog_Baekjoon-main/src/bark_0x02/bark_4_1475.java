package bark_0x02;

import java.util.Arrays;
import java.util.Scanner;

public class bark_4_1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int []count=new int[10];
        for (int i = 0; i < n.length(); i++) {
            int digit=n.charAt(i)-'0';
            if(digit==9){
                digit=6;
            }
            count[digit]++;
        }
        count[6]=count[6]/2+count[6]%2;
        Arrays.sort(count);
        System.out.println(count[8]);
    }
}
