package oneArrange_4;

import java.util.Scanner;

public class one_5_10810 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int [n];
        int m= sc.nextInt();
        int i=0;
        while(i<m){

            int I= sc.nextInt();
            int J= sc.nextInt();
            int K= sc.nextInt();
            int j=I-1;
            while(j<J) {
                arr[j]=K;
                j++;
            }
            i++;
        }
        int k=0;
        while(k< arr.length){
            System.out.print(arr[k]+" ");
            k++;
        }


    }
}

/*
첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.

        둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다.
        각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터
        j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다.
        예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다.
        (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)

        도현이는 입력으로 주어진 순서대로 공을 넣는다.
*/