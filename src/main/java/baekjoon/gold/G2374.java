package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class G2374 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Long> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        long max = 0, answer = 0;
        for (int i = 0; i < n; i++) {
            long x = Integer.parseInt(br.readLine());
            max = Math.max(max, x);

            if (stack.isEmpty()) {
                stack.push(x);
            } else {
                if (stack.peek() < x) {
                    answer += x - stack.pop();
                    stack.push(x);
                } else if (stack.peek() > x) {
                    stack.pop();
                    stack.add(x);
                }
            }
        }
        while (!stack.isEmpty()) {
            long num = stack.pop();
            answer += max - num;
        }
        System.out.println(answer);
    }
}