package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class G7569 {
    private static int m, n, h;
    private static int[][][] board, dis;
    static Queue<Point> Q = new LinkedList<>();
    static int[] dx = {-1, 0, 0, 1, 0, 0};
    static int[] dy = {0, -1, 0, 0, 1, 0};
    static int[] dz = {0, 0, -1, 0, 0, 1};

    private static class Point {
        int z, x, y;

        public Point(int z, int x, int y) {
            this.z = z;
            this.x = x;
            this.y = y;
        }
    }

    private void BFS() {
        while (!Q.isEmpty()) {
            Point tmp = Q.poll();
            for (int i = 0; i < 6; i++) {
                int nz = tmp.z + dz[i];
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nz >= 0 && nz < h && nx >= 0 && nx < n && ny >= 0 && ny < m && board[nz][nx][ny] == 0) {
                    board[nz][nx][ny] = 1;
                    Q.offer(new Point(nz, nx, ny));
                    dis[nz][nx][ny] = dis[tmp.z][tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        G7569 T = new G7569();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        board = new int[h][n][m];
        dis = new int[h][n][m];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    board[i][j][k] = Integer.parseInt(st.nextToken());
                    if (board[i][j][k] == 1) {
                        Q.offer(new Point(i, j, k));
                    }
                }
            }
        }
        T.BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (board[i][j][k] == 0) {
                        flag = false;
                    }
                }
            }
        }
        if (flag) {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++) {
                        answer = Math.max(answer, dis[i][j][k]);
                    }
                }
            }
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}