package lecture.H08_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class HMain502 {
    private static int answer = Integer.MAX_VALUE;
    private static int n, m;

    private static void DFS(int L, int sum, Integer[] arr) {
        if (sum > m) {
            return;
        }
        if (L >= answer) {
            return;
        }
        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];  // Collections 때문에 Integer 해야 됨
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = Integer.parseInt(br.readLine());
        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
