package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class G6443 {
    private static char[] result, arr, mx;
    private static boolean[] visit;

    private static void DFS(int length, int depth) {
        if (depth == length) {
            System.out.print(result);
            System.out.print("\n");
            return;
        }
        mx[depth] = 0;
        for (int i = 0; i < length; i++) {
            if (visit[i]) {
                continue;
            }
            if (mx[depth] >= arr[i]) {
                continue;
            }
            mx[depth] = arr[i];
            visit[i] = true;
            result[depth] = arr[i];
            DFS(length, depth + 1);
            visit[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            arr = br.readLine().toCharArray();
            result = new char[arr.length];
            mx = new char[arr.length];
            visit = new boolean[arr.length];

            Arrays.sort(arr);

            DFS(arr.length, 0);
        }
        br.close();
    }
}
