package sort_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sort_6_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int i=0;
        long arr[]=new long[s.length()];
        while(i<s.length()){
            arr[i]=s.charAt(i)-'0';
            i++;
        }
        Arrays.sort(arr);
        int k=arr.length-1;
        while(k!=-1){

            System.out.print(arr[k]);
            k--;
        }
    }
}
