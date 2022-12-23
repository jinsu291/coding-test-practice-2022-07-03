package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G17845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int DP[] = new int[N + 1];

        int clist[] = new int[K + 1];
        int vlist[] = new int[K + 1];

        for(int i = 1; i <= K; i++) {
            st = new StringTokenizer(br.readLine());
            int imp = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            clist[i] = cost;
            vlist[i] = imp;
        }

        for(int i = 1; i <= K; i++) {
            int cost = clist[i];
            int imp = vlist[i];
            for(int j = N; j >= 1; j--) {
                if(cost <= j) {
                    DP[j] = Math.max(DP[j], DP[j - cost] + imp);
                }
            }

        }
        System.out.println(DP[N]);
    }
}
