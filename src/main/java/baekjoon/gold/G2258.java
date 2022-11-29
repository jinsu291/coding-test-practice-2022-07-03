package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class G2258 {
    private static class Beef implements Comparable<Beef>{
        int g, p;

        public Beef(int g, int p) {
            this.g = g;
            this.p = p;
        }

        @Override
        public int compareTo(Beef o) {
            if (this.p == o.p) {
                return o.g - this.g;
            }
            return this.p - o.p;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        PriorityQueue<Beef> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int g = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            pq.add(new Beef(g, p));
        }
        boolean flag = false;
        int wp = 0;
        long wg = 0;
        int bc = -1;
        int sc = 0;
        int answer = Integer.MAX_VALUE;

        while (!pq.isEmpty()) {
            Beef beef = pq.poll();
            int g = beef.g;
            int p = beef.p;
            if (bc != p) {
                bc = p;
                sc = 0;
            } else {
                sc += p;
            }
            wg += g;
            wp = p;

            if (wg >= m) {
                flag = true;
                answer = Math.min(answer, wp + sc);
            }
        }
        if (flag) {
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}
