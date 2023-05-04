package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//ㅇㅇ
public class S2164 {
    private int solution(int n) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            Q.offer(i);
        }
        while (Q.size() > 1) {
            Q.poll();
            Q.offer(Q.poll());
        }
        answer = Q.poll();
        return answer;
    }

    public static void main(String[] args) throws IOException {
        S2164 T = new S2164();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(T.solution(n));
    }
}
