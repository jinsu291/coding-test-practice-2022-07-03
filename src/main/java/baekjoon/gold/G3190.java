package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class G3190 {
    private static Map<Integer, String> moveInfo;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    private static int n, d = 0;
    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        moveInfo = new HashMap<>();
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            arr[a][b] = 1;
        }
        int I = Integer.parseInt(br.readLine());
        for (int i = 0; i < I; i++) {
            st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            String direction = st.nextToken();
            moveInfo.put(time, direction);
        }
        solution();
    }

    private static void solution() {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(0);
        int time = 0;
        int px = 0;
        int py = 0;

        while (true) {
            int nx = px + dx[d];
            int ny = py + dy[d];
            time++;
            if (nx < 0 || ny < 0 || nx > n - 1 || ny > n - 1) {
                break;
            }
            if (Q.contains(ny * n + nx)) {
                break;
            }
            if(arr[ny][nx] ==1) {
                arr[ny][nx] = 0;
                Q.add(ny*n +nx);
            }else {
                Q.add(ny*n +nx);
                Q.poll();
            }
            if (moveInfo.containsKey(time)) {
                String data = moveInfo.get(time);
                if (data.equals("D")) {
                    d += 1;
                    if (d == 4) {
                        d = 0;
                    }
                } else {
                    d -= 1;
                    if (d == -1) {
                        d = 3;
                    }
                }
            }
            px = nx;
            py = ny;
        }
        System.out.println(time);
    }
}