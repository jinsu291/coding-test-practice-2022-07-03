package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class G1461 {
    private static ArrayList<Integer> plus, minus;
    private static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> mq = new PriorityQueue<>(Collections.reverseOrder());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(st.nextToken());
            if (now >= 0) {
                pq.add(now);
            } else {
                mq.add(Math.abs(now));
            }
        }
        int end = 0;

        if (pq.isEmpty()) {
            end = mq.peek();
        } else if (mq.isEmpty()) {
            end = pq.peek();
        } else {
            end = Math.max(mq.peek(), pq.peek());
        }

        int answer = 0;
        while (!pq.isEmpty()) {
            answer += pq.peek() * 2;
            for (int i = 0; i < m; i++) {
                pq.poll();
            }
        }
        while (!mq.isEmpty()) {
            answer += mq.peek() * 2;
            for (int i = 0; i < m; i++) {
                mq.poll();
            }
        }
        answer -= end;
        System.out.println(answer);
    }
}
