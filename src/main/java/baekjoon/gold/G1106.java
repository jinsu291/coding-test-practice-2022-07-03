package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class G1106 {
    private static int INF = 987654321;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] dp = new int[c + 101];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int j = b; j < c + 101; j++) {
                dp[j] = Math.min(dp[j], a + dp[j - b]);
            }
        }
        int answer = INF;
        for (int i = c; i < c + 101; i++) {
            answer = Math.min(answer, dp[i]);
        }
        System.out.println(answer);
    }
}
