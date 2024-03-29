package baekjoon.gold;

import java.io.IOException;
import java.util.*;

public class G15686 {

    private static ArrayList<Point> ch, hs;
    private static int len, n, m, answer = Integer.MAX_VALUE;
    private static int[] combi;

    private static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private void DFS(int L, int s) {
        if (L == m) {
            int sum = 0;
            for (Point h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - ch.get(i).x) + Math.abs(h.y - ch.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        G15686 T = new G15686();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        ch = new ArrayList<>();
        hs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = kb.nextInt();
                if (tmp == 1) {
                    hs.add(new Point(i, j));
                } else if (tmp == 2) {
                    ch.add(new Point(i, j));
                }
            }
        }
        len = ch.size();
        combi = new int[m];
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
