package lecture.E05_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class EMain302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num;
            }
        }
        int m = Integer.parseInt(br.readLine());
        int[] move = new int[m];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < move.length; i++) {
            int num = Integer.parseInt(st.nextToken());
            move[i] = num;
        }
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : move) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][pos - 1] != 0) {
                    int tmp = arr[i][pos - 1];
                    arr[i][pos - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        result += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
