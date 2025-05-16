package String_7;

import java.util.Scanner;

public class String6_1152 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String words= sc.nextLine().trim();
        if(words.isEmpty()){
            System.out.println("0");

        }
        else{
            System.out.println(words.split(" ").length);
        }
    }
}
