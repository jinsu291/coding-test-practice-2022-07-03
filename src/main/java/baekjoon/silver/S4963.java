package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S4963 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) {
                break;
            }
            int[][] arr = new int[b][a];

            for (int i = 0; i < b; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < a; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            Queue<Point> Q = new LinkedList<>();
            int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
            int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };
            int answer = 0;
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < a; j++) {
                    if (arr[i][j] == 0) {
                        continue;
                    }
                    Q.add(new Point(i, j));
                    arr[i][j] = 0;
                    answer++;
                    while (!Q.isEmpty()) {
                        Point xy = Q.poll();
                        for (int k = 0; k < 8; k++) {
                            int nx = xy.x + dx[k];
                            int ny = xy.y + dy[k];
                            if (nx < 0 || b <= nx || ny < 0 || a <= ny) {
                                continue;
                            }
                            if (arr[nx][ny] != 0) {
                                Q.add(new Point(nx, ny));
                                arr[nx][ny] = 0;
                            }
                        }
                    }
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }

    private static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
