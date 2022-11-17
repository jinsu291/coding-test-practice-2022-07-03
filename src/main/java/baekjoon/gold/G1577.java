package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G1577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());
        boolean[][][] arr = new boolean[m + 1][n + 1][2];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if (a < c || b < d) {
                if (a < c) {
                    arr[b][a][0] = true;
                } else {
                    arr[b][a][1] = true;
                }
            } else {
                if (c < a) {
                    arr[d][c][0] = true;
                } else {
                    arr[d][c][1] = true;
                }
            }
        }
        long[][] dp = new long[m + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            if (arr[0][i - 1][0]) {
                break;
            }
            dp[0][i] = 1;
        }
        for (int i = 1; i <= m; i++) {
            if (arr[i - 1][0][1]) {
                break;
            }
            dp[i][0] = 1;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(!arr[i][j-1][0]) {
                    dp[i][j] += dp[i][j-1];
                }
                if(!arr[i-1][j][1]) {
                    dp[i][j] += dp[i-1][j];
                }
            }
        }
        System.out.println(dp[m][n]);
    }
}
