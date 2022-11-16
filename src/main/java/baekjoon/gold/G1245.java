package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G1245 {
    static int dx[]= {-1,1,0,0,1,1,-1,-1};
    static int dy[]= {0,0,-1,1,1,-1,1,-1};
    static boolean[][] visited;
    static boolean pick;
    private static int n, m, answer;
    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    pick = true;
                    DFS(i, j);
                    if (pick) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }

    private static void DFS(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 8; i++) {
            int kx = x + dx[i];
            int ky = y + dy[i];
            if (kx < 0 || ky < 0 || kx >= n || ky >= m) {
                continue;
            }
            if (arr[kx][ky] > arr[x][y]) {
                pick = false;
            }
            if (!visited[kx][ky] && arr[kx][ky] == arr[x][y]) {
                DFS(kx, ky);
            }
        }
    }
}
