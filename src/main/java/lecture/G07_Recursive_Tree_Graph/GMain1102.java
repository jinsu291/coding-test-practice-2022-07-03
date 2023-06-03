package lecture.G07_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class GMain1102 {
    private static int n;
    private static int answer;
    private static int[][] graph;
    private static int[] arr;

    private static void DFS(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && arr[i] == 0) {
                    arr[i] = 1;
                    DFS(i);
                    arr[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        graph = new int[n + 1][n + 1];
        arr = new int[n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
        }
        arr[1] = 1;
        DFS(1);
        System.out.println(answer);
    }
}
