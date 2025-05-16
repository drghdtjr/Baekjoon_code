package bark_0x04;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class bark_3_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());

        Queue<Integer> queue=new LinkedList<>();
        for(int i=1;i<=n;i++){
            queue.add(i);

        }
        int arr[]=new int[n];
        int index=0;
        while(!queue.isEmpty()){
            for(int i=0; i<m-1;i++){
                //queue poii은 맨 앞의 요소를 뺴서 반환 시킴 ,그래서 맨 앞에서 뺸 요소를 queue add 를 통해 맨 뒤에 추가함
                queue.add(queue.poll());
            }
            arr[index++]= queue.poll();
        }
        bw.write("<");
        for (int ch:arr){
            bw.write(ch+", ");
        }
        bw.write(">");
        bw.close();

    }
}
