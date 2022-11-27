package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class G6068 {
    static class Pair implements Comparable<Pair> {
        int time;
        int end;

        public Pair(int time, int end) {
            this.time = time;
            this.end = end;
        }

        @Override
        public int compareTo(Pair o) {
            return o.end - this.end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int time, end;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            time = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            pq.add(new Pair(time, end));
        }
        Pair tmp = pq.poll();
        int start = tmp.end - tmp.time;
        while(!pq.isEmpty()) {
            Pair cur = pq.poll();
            if(start < cur.end) {
                start = start - cur.time;
            }else {
                start = cur.end - cur.time;
            }
        }
        if(start < 0 ) {
            System.out.println(-1);
        }else
            System.out.println(start);
    }
}
