package bark_0x07;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
public class bark_2_1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));


        String[]input=br.readLine().split(" ");
        int n=Integer.parseInt(input[0]);
        int m=Integer.parseInt(input[1]);
        Deque<Integer>deque=new LinkedList<>();
        for(int i=1;i<=n;i++){
            deque.offer(i);
        }
        int count=0;
        String[]number=br.readLine().split(" ");

        for(int i=0;i<m;i++){
            int num=Integer.parseInt(number[i]);
            int index=where_num(deque,num);
            int before_num=index;
            int after_num=deque.size()-before_num;
            int min=0;
            if(before_num<=after_num){
                for(int s=0;s<before_num;s++){
                    int x=deque.pollFirst();
                    deque.offer(x);
                    count++;
                }
                deque.pollFirst();
            }
            else{
                for(int s=0;s<after_num;s++){
                    int k=deque.pollLast();
                    deque.offerFirst(k);
                    count++;
                }
                deque.pollFirst();

            }
        }
        bw.write(String.valueOf(count));
        bw.close();
        br.close();
    }
    public static int where_num(Deque<Integer>deque,int target){
        int index=0;
        for(Integer element:deque){
            if(element.equals((target))){
                return index;
            }
            index++;
        }
        return -1;
    }
}
