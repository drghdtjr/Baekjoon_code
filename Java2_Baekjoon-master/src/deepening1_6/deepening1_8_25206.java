package deepening1_6;

import java.util.Scanner;

public class deepening1_8_25206 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        double a=0;
        double count=0;
        while(i<20){
            String object= sc.next();
            double point= sc.nextDouble();
            String score=sc.next();
            if(score.equals("A+")){
                a+=point*4.5;
                count+=point;
            }
            else if(score.equals("A0")){
                a+=point*4.0;
                count+=point;
            }
            else if(score.equals("B+")){
                a+=point*3.5;
                count+=point;
            }
            else if(score.equals("B0")){
                a+=point*3.0;
                count+=point;
            }
            else if(score.equals("C+")){
                a+=point*2.5;
                count+=point;
            }
            else if(score.equals("C0")){
                a+=point*2.0;
                count+=point;
            }
            else if(score.equals("D+")){
                a+=point*1.5;
                count+=point;
            }
            else if(score.equals("D0")){
                a+=point*1.0;
                count+=point;
            }
            else if(score.equals("F")){
                a+=point*0.0;
                count+=point;
            }

            i++;
        }
        System.out.println(a/count);
    }

}

