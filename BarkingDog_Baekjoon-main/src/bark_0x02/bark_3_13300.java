package bark_0x02;

import java.util.Scanner;

public class bark_3_13300 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int arr[][]=new int[2][7];
        int i=0;
        while(i<n){
            int s= sc.nextInt();
            int y= sc.nextInt();
            arr[s][y]++;
            i++;
        }
        int room=0;
        for(int j=0;j<2;j++){
            for(int z=1;z<7;z++){
                if(arr[j][z]==0){
                    continue;
                }
                else if(arr[j][z]<=k){
                    room++;
                }
                else if(arr[j][z]%k==0){
                    room+=arr[j][z]/k;
                }
                else if(arr[j][z]%k!=0){
                    room+=arr[j][z]/k;
                    room++;
                }
            }
        }
        System.out.println(room);

    }
}
