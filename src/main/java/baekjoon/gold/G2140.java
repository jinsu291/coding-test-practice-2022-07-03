package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G2140 {
    private static int n;
    private static char[][] map;
    static int dx[] = {-1,-1,-1,0,0,1,1,1};
    static int dy[] = {-1,0,1,-1,1,-1,0,1};

    private static void check(int x, int y, int cur) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if( nx<0 || ny<0 || nx >=n || ny >=n ) {
                continue;
            }
            if(map[nx][ny] == '#' && cur != 0) {
                cur--;
                map[nx][ny] = '*';
            }else if(map[nx][ny] == '*' && cur != 0) {
                cur--;
            }else if(map[nx][ny] == '#' && cur == 0) {
                map[nx][ny] = '-';
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Character.isDigit(map[i][j])) {
                    int cur = map[i][j] - '0';
                    check(i, j, cur);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == '*' || map[i][j] == '#') {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
