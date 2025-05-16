package While_4;

import java.util.Scanner;

public class While3_1110 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        int count=0;
        int first_num=n;
        while(true){
            n=(n%10)*10+((n/10)+(n%10))%10;
            count++;
            if(first_num==n)
            {
                break;
            }

        }
        System.out.println(count);

    }
}
