package baekjoon.gold;

import java.io.*;
import java.util.*;

public class G2624 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int target, num;

        target = Integer.parseInt(br.readLine());
        num = Integer.parseInt(br.readLine());

        int[][] list = new int[num][2];
        int[] dp = new int[target + 1];

        for (int x = 0; x < num; x++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            list[x][0] = Integer.parseInt(st.nextToken());
            list[x][1] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 1;

        for (int y = 0; y < num; y++) {

            int base = list[y][0];

            for (int x = target; x >= base; x--) {

                for (int w = 1; w <= list[y][1]; w++) {

                    if (x - base * w < 0) {
                        break;
                    }

                    dp[x] += dp[x - base * w];

                }
            }
        }
        System.out.println(dp[target]);
    }
}
