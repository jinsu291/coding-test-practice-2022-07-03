package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class G1662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                cnt -= 1;
                int k = str.charAt(i - 1) - '0';
                stack1.add(cnt);
                stack2.add(k);
                cnt = 0;
            } else if (c == ')') {
                int m = stack2.peek();
                stack2.pop();
                m *= cnt;
                int z = stack1.peek();
                stack1.pop();
                cnt = z + m;
            } else {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
