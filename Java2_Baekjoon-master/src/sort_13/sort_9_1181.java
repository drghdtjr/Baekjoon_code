package sort_13;

import java.util.Scanner;
// 안됌

public class sort_9_1181 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String[]arr=new String[n];
        int i=0;
        while(i<n) {
            arr[i] = sc.next();
            i++;
        }
        int k=0;
        while(k<n){
            int j=k+1;
            while(j<n){
                 if(arr[k].length()==arr[j].length()) {
                    if (arr[k].charAt(0) - 'a' > arr[j].charAt(0) - 'a') {
                        String temp = arr[k];
                        arr[k] = arr[j];
                        arr[j] = temp;
                        // 똑같은 길이가 나타날시 맨앞의 대문자로 비교 해서 바꿔줌
                    }
                    else{
                        String temp = arr[k];
                        arr[k] = arr[j];
                        arr[j] = temp;
                    }
                }
                j++;
            }
            k++;
        }
        System.out.println(arr[0]);
        int s=1;
        while(s<n){
            if(!arr[s].equals(arr[s-1])){
                System.out.println(arr[s]);
            }
            s++;
        }

    }
}
