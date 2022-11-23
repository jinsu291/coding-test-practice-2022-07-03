package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// N의 범위가 상당히 크기 때문에, 일반적인 dp로 메모이제이션 하며 해결하기에는 메모리가 터져버린다.
public class G1354 {
    private static int p, q, x, y;
    private static HashMap<Long, Long> map;

    private long solution(long n) {
        if (n <= 0) {
            return 1;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        long a = (long) Math.floor(n / p - x);
        long b = (long) Math.floor(n / q - y);

        map.put(n, solution(a) + solution(b));
        return map.get(n);
    }

    public static void main(String[] args) throws IOException {
        G1354 T = new G1354();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        p = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        map = new HashMap<Long, Long>();
        System.out.println(T.solution(n));
    }
}
