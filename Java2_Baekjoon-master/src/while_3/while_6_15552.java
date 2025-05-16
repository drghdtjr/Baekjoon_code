package while_3;

import java.io.*;
import java.util.StringTokenizer;

public class while_6_15552 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
            while(n>0){
                StringTokenizer st=new StringTokenizer(br.readLine());
                int a= Integer.parseInt(st.nextToken());
                int b= Integer.parseInt(st.nextToken());
                bw.write(String.valueOf(a+b)+"\n");

                n--;
            }
            bw.flush();

        }
        catch(IOException e) {
            System.out.println("유지원바보");

        }


    }
}
