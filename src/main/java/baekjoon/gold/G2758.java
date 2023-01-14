package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G2758 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        while(testCase-- > 0){
            int N, M;
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

            N = Integer.parseInt(stringTokenizer.nextToken());
            M = Integer.parseInt(stringTokenizer.nextToken());

            long[][] dp = new long[N+1][M+1];

            for(int i = 0 ; i < M+1; i++){
                dp[0][i] = 1;
            }

            for(int n = 1; n < N+1 ; n++){
                for(int m = 1; m < M+1 ; m++){
                    dp[n][m] = dp[n-1][m/2] + dp[n][m-1];
                }
            }

            System.out.println(dp[N][M]);
        }
    }
}