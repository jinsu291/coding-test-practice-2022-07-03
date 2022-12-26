package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//ㅇ
public class S2161 {
    private ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(i + 1);
        }
        while (Q.size() != 1){
                System.out.print(Q.poll().toString() + " ");
                Q.offer(Q.poll());
        }
        System.out.print(Q.poll());
        return answer;
    }

    public static void main(String[] args) throws IOException {
        S2161 T = new S2161();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int x : T.solution(n)) {
            System.out.print(x);
        }
    }
}
