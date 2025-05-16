package bark_0x06;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class bark_2_2164 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        Queue<Integer>queue= new LinkedList<>();
        for(int i=1;i<=n;i++){
            queue.offer(i);
        }
        int last=0;
        while(!queue.isEmpty()){
            last= queue.peek();
            queue.poll();
            queue.offer(queue.peek());
            queue.poll();
        }
        bw.write(String.valueOf(last));
        bw.close();
        br.close();
    }

}
