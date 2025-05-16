package Sets_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sets_1_10815 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n=Integer.parseInt((br.readLine()));
        int []cards=new int [n];
        st=new StringTokenizer(br.readLine());
        int i=0;
        while(i<n){
            cards[i]=Integer.parseInt(st.nextToken());
            i++;
        }
        Arrays.sort(cards);
        int m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        int k=0;
        while(k<m){
            int temp=Integer.parseInt(st.nextToken());
            if(binarySearch(cards,n,temp)){
                bw.write("1"+" ");
            }
            else{
                bw.write("0"+" ");
            }
            k++;
        }
        bw.flush();
        bw.close();
        br.close();




    }
    public static Boolean binarySearch(int []cards, int n, int search){
        int first=0;
        int last=n-1;
        int mid=0;
        while(first<=last){
            mid=(first+last)/2;
            if(cards[mid]==search){
                return true;
            }
            if(cards[mid]<search){
                first= mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return false;
    }

}
