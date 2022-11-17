package lecture.J10_DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class JMain501 {
    private static int[] dy;
    private static int n, m;

    private int solution(int[] arr) {
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - arr[i]] + 1);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        JMain501 T = new JMain501();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        m = kb.nextInt();
        dy = new int[m + 1];
        System.out.println(T.solution(arr));
    }
}