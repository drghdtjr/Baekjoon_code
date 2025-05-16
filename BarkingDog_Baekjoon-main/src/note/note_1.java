package note;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class note_1{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < n) {
            String st = br.readLine();
            if (st.charAt(0) == 'p') {
                if (st.charAt(1) == 'u') {
                    stack.add(st.charAt(5));
                }
                if (st.charAt(1) == 'o') {
                    if (stack.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        stack.pop();
                    }
                }
            }
            if (st.charAt(0) == 's') {
                bw.write(stack.size() + "\n");
            }
            if (st.charAt(0) == 'e') {
                if (stack.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            }
            if (st.charAt(0) == 't') {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.peek() + "\n");
                }
            }

            i++;
        }
        br.close();
        bw.close();
    }
}

