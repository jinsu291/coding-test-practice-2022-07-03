package baekjoon.bronze;

import java.util.Scanner;

public class B2506 {

    public int solution(int n, int[] arr){
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] == 1){
                count++;
                sum += count;
            } else {
                count = 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        B2506 T = new B2506();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
