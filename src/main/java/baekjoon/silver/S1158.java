package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> Q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 1; i <= n; i++) {
            Q.offer(i);
        }
        while (!Q.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                Q.offer(Q.poll());
            }
            sb.append(Q.poll());
            if (Q.size() != 0) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
