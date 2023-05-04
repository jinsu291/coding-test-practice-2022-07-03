package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//ㅇㅇ
public class S1935 {
    private String solution(int n, String str, double[] arr) {
        String answer = "";
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                stack.push(arr[str.charAt(i) - 'A']);
            } else {
                double rt = stack.pop();
                double lt = stack.pop();
                if (str.charAt(i) == '+') {
                    stack.push(lt + rt);
                } else if (str.charAt(i) == '-') {
                    stack.push(lt - rt);
                } else if (str.charAt(i) == '*') {
                    stack.push(lt * rt);
                } else if (str.charAt(i) == '/') {
                    stack.push(lt / rt);
                }
            }
        }
        answer = String.format("%.2f", stack.get(0));
        return answer;
    }

    public static void main(String[] args) throws IOException {
        S1935 T = new S1935();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }
        System.out.println(T.solution(n, str, arr));
    }
}
