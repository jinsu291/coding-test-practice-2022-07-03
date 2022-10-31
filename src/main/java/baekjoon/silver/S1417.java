package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S1417 {
    private int solution(int n, int a, int[] arr) {
        int answer = 0;
        while (true) {
            Arrays.sort(arr);
            if (arr[n - 2] < a) {
                break;
            }
            answer++;
            arr[n - 2]--;
            a++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        S1417 T = new S1417();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.println(0);
            return;
        }
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(T.solution(n, a, arr));
    }
}
