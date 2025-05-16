package stackquedeq_16;

import java.io.*;
import java.util.Stack;

public class s_1_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer>stack=new Stack<>();
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String []command=br.readLine().split(" ");
            switch (command[0]){
                case "1":
                    int x=Integer.parseInt(command[1]);
                    stack.push(x);
                    break;
                case "2":
                    if(stack.isEmpty()){
                        bw.write("-1\n");
                    }
                    else{
                        bw.write(String.valueOf(stack.pop())+"\n");
                    }
                    break;
                case "3":
                    bw.write(String.valueOf(stack.size())+"\n");
                    break;
                case "4":
                    if(stack.isEmpty()){
                        bw.write("1\n");
                    }
                    else{
                        bw.write("0\n");
                    }
                    break;
                case "5":
                    if(stack.isEmpty()){
                        bw.write("-1\n");
                    }
                    else{
                        bw.write(String.valueOf(stack.peek())+"\n");
                    }
                    break;

            }

        }
        bw.close();
        br.close();

    }
}
