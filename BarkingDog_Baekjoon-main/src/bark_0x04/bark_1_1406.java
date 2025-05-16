package bark_0x04;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class bark_1_1406 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String str=br.readLine();
        int m=Integer.parseInt(br.readLine());
        LinkedList<Character> editor=new LinkedList<>();
        //리스트에 한 단어씩 쪼깨서 넣을꺼임
        for(int i=0;i<str.length();i++){
            editor.add(str.charAt(i));
        }
        //커서를 맨끝으로 보내기 위해 listIterator를 사용함
        ListIterator<Character> iterator= editor.listIterator();
        /*그래서 hasnext 뒤에 있으면 그 다음꺼로 넘어가는 식으로 문자가
        안나올때까지 계속 커서를 뒤로 넘김
        */
        while(iterator.hasNext()){
            iterator.next();
        }

        for(int i=0; i<m;i++){
            String command= br.readLine();
            char c=command.charAt(0);
            switch (c){
                case'L':
                    //현재 이전 위치에 요소가 있는지 체크하고 이전 요소가 있다면 위치를 이전요소로 이동함
                    if(iterator.hasPrevious()) {
                        iterator.previous();
                    }
                    break;
                case'D':
                    //현재 다음 위치에 요소가 있는지 체크하고 있으면 다음요소 위치로 이동함
                    if(iterator.hasNext()){
                        iterator.next();
                    }
                    break;
                case'B':
                    //그 전에 요소가 있는지 체크하고 있다면 전 요소로 돌아가고 그 요소를 지움
                    if(iterator.hasPrevious()){
                        iterator.previous();
                        iterator.remove();
                    }
                    break;
                case'P':
                    char t=command.charAt(2);
                    iterator.add(t);
                    break;
            }
        }
        for(Character chr:editor){
            bw.write(chr);
        }
        bw.flush();
        bw.close();
    }
}
