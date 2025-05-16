package bark_0x04;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class bark_2_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int m=Integer.parseInt(br.readLine());
        LinkedList <Character> editor=new LinkedList<>();
        for(int i=0;i<m;i++){
            String str=br.readLine();
            ListIterator <Character> iter=editor.listIterator();

            for(char c:str.toCharArray()){
                switch (c){
                    case '<':
                        if(iter.hasPrevious()){
                            iter.previous();
                        }
                        break;
                    case '>':
                        if(iter.hasNext()){
                            iter.next();
                        }
                        break;
                    case '-':
                        if(iter.hasPrevious()){
                            iter.previous();
                            iter.remove();
                        }
                        break;
                    default:
                        iter.add(c);
                        break;
                }
            }
        }


    }
}
