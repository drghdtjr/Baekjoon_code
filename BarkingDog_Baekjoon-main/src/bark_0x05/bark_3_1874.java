package bark_0x05;

import java.io.*;

public class bark_3_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        String[] input=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(input[i]);
        }
        for(int i=0;i<n;i++){
            if(arr[i+1]>arr[i]){

            }
        }
        br.close();
        bw.close();


    }
}
