package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//ㅇㅇ
public class S2606 {
    private static int[][] graph;
    private static int n;
    private static int[] arr;
    private static int answer = 0;

    private static void DFS(int k) {
        if (arr[k] == 1) {
            return;
        }
        arr[k] = 1;
        answer++;
        for (int j = 0; j < n + 1; j++) {
            if (arr[j] == 0 && graph[k][j] == 1) {
                DFS(j);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        graph = new int[n + 1][n + 1];
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }
        DFS(1);
        System.out.println(answer - 1);
    }
}
