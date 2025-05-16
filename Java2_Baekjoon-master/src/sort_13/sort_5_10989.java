package sort_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sort_5_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        int []arr=new int[n];
        int i=0;
        while(i<n){
            arr[i]=Integer.parseInt(br.readLine());
            i++;
        }
        Arrays.sort(arr);
        int k=0;
        while(k<n){
            sb.append(arr[k]).append(('\n'));
            k++;
        }
        System.out.println(sb);

    }
}
