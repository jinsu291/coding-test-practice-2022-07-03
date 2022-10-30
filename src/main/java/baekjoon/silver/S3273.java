package baekjoon.silver;

import java.util.Scanner;

public class S3273 {
    private int solution(int n, int[] arr, int k) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        S3273 T = new S3273();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        int k = kb.nextInt();
        System.out.println(T.solution(n, arr, k));
    }
}