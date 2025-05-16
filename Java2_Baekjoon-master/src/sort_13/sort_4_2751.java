package sort_13;

import java.util.*;

public class sort_4_2751 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=0;
        StringBuilder sb=new StringBuilder();
        ArrayList<Integer>list=new ArrayList<>();
        while(i<n){
            list.add(sc.nextInt());
            i++;
        }
        Collections.sort(list);
        for(Integer c:list){
            sb.append(c).append("\n");
        }
        System.out.println(sb);
    }
}
