package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (n == 0) {
            System.out.println(0);
            return;
        }
        st = new StringTokenizer(br.readLine());
        int cap = m;
        int cnt = 1;
        while (n-- > 0) {
            int cur = Integer.parseInt(st.nextToken());
            if (cap - cur >= 0) {
                cap -= cur;
            } else {
                cnt++;
                cap = m - cur;
            }
        }
        System.out.println(cnt);
    }
}
