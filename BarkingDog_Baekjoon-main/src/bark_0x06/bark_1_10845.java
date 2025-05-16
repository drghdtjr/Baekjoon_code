package bark_0x06;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class bark_1_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());
        Queue<Integer>queue=new LinkedList<>();
        for(int i=0; i<n;i++){
            String[]command=br.readLine().split(" ");
            switch (command[0]){
                case"push":
                    int x=Integer.parseInt(command[1]);
                    queue.offer(x);
                    break;

                case"pop":
                    if(queue.isEmpty()){
                        bw.write("-1\n");
                    }
                    else{
                        bw.write(String.valueOf(queue.poll())+"\n");
                    }
                    break;
                case"size":
                    bw.write(String.valueOf(queue.size())+"\n");
                    break;
                case"empty":
                    if(queue.isEmpty()){
                        bw.write("1\n");
                    }
                    else{
                        bw.write("0\n");
                    }
                    break;
                case"front":
                    if(queue.isEmpty()){
                        bw.write("-1\n");
                    }
                    else{
                        bw.write(String.valueOf(queue.peek())+"\n");
                    }
                    break;
                case"back":
                    if(queue.isEmpty()){
                        bw.write("-1\n");
                    }
                    else{
                        int last=((LinkedList<Integer>)queue).peekLast();
                        bw.write(String.valueOf(last)+"\n");
                    }
                    break;

            }

        }
        bw.close();
        br.close();

    }
}
