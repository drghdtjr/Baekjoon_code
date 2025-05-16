package bark_0x05;

import java.io.*;
import java.util.Stack;

public class bark_2_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int k=Integer.parseInt(br.readLine());
        Stack <Integer> stack=new Stack<>();
        int i=0;
        while(i<k){
            int a=Integer.parseInt(br.readLine());
            if(a!=0){
                stack.push(a);
            }
            else{
                stack.pop();
            }
            i++;
        }
        int s=0;
        int sum=0;
        while(!stack.empty()){
            sum+=stack.pop();
        }
        bw.write(Integer.toString(sum));
        bw.close();
        br.close();

    }
}
