package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class G2294 {
    private static int n, m;
    private static int[] dy;

    private int solution(int[] arr) {
        Arrays.fill(dy, 100001);
        dy[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - arr[i]] + 1);
            }
        }
        if (dy[m] == 100001) {
            return -1;
        } else {
            return dy[m];
        }
    }

    public static void main(String[] args) throws IOException {
        G2294 T = new G2294();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        dy = new int[m + 1];
        System.out.println(T.solution(arr));
    }
}