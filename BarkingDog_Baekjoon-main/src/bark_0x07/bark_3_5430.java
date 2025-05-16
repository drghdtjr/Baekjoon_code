package bark_0x07;

import java.io.*;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class bark_3_5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t= Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String p=br.readLine();
            char[]ch= p.toCharArray();

            int n=Integer.parseInt(br.readLine());
            Deque<Integer>deque=new LinkedList<>();
            String str=br.readLine();
            String subs=str.substring(1,str.length()-1);
            String[]s=subs.split(",");
            for(String num:s){
                if(!num.isEmpty()){
                    deque.offer(Integer.parseInt(num));
                }
            }



            bw.close();
            br.close();

        }

    }
}
