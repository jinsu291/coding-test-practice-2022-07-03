package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G9084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            int k = Integer.parseInt(br.readLine());
            int[] arr = new int[k];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int s = Integer.parseInt(br.readLine());
            int[] dp = new int[s + 1];
            dp[0] = 1;

            for (int j = 0; j < k; j++) {
                for (int l = arr[j]; l <= s; l++) {
                    dp[l] += dp[l - arr[j]];
                }
            }
            System.out.println(dp[s]);
        }
    }
}
