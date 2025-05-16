package bark_0x07;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class bark_1_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        Deque<Integer>deque=new LinkedList<>();
        for(int i=0;i<n;i++){
            String[]command=br.readLine().split(" ");
            switch (command[0]){
                case"push_front":
                    int x=Integer.parseInt(command[1]);
                    deque.addFirst(x);
                    break;
                case"push_back":
                    int y=Integer.parseInt(command[1]);
                    deque.addLast(y);
                    break;
                case"pop_front":
                    if(deque.isEmpty()){
                        bw.write("-1\n");
                    }
                    else{
                        bw.write(String.valueOf(deque.getFirst())+"\n");
                        deque.pollFirst();
                    }
                    break;
                case"pop_back":
                    if(deque.isEmpty()){
                        bw.write("-1\n");
                    }
                    else{
                        bw.write(String.valueOf(deque.getLast())+"\n");
                        deque.pollLast();
                    }
                    break;
                case"size":
                    bw.write(String.valueOf(deque.size())+"\n");
                    break;
                case"empty":
                    if(deque.isEmpty())
                    {
                        bw.write("1\n");
                    }
                    else{
                        bw.write("0\n");
                    }
                    break;
                case"front":
                    if(deque.isEmpty()){
                        bw.write("-1\n");
                    }
                    else{
                        bw.write(String.valueOf(deque.getFirst())+"\n");

                    }
                    break;
                case"back":
                    if(deque.isEmpty()){
                        bw.write("-1\n");
                    }
                    else{
                        bw.write(String.valueOf(deque.getLast())+"\n");
                    }
                    break;
            }


        }
        bw.close();
        br.close();

    }
}


