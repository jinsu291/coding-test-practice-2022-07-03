package lecture.J10_DynamicProgramming;

import java.util.Scanner;

public class JMain101 {
    private static int[] dy;
    private int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i < n; i++) {
            dy[i] = dy[i - 1] + dy[i - 2];
        }
        return dy[n];
    }

    public static void main(String[] args) {
        JMain101 T = new JMain101();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dy = new int[n + 1];
        System.out.println(T.solution(n));
    }
}
