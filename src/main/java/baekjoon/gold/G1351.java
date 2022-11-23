package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
// N의 범위가 상당히 크기 때문에, 일반적인 dp로 메모이제이션 하며 해결하기에는 메모리가 터져버린다.
public class G1351 {
    private static int b, c;
    private static HashMap<Long, Long> map;

    private long solution(long n) {
        if (n == 0) {
            return 1;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        long a = (long) Math.floor(n / b);
        long b = (long) Math.floor(n / c);

        map.put(n, solution(a) + solution(b));
        return map.get(n);
    }

    public static void main(String[] args) throws IOException {
        G1351 T = new G1351();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new HashMap<Long, Long>();
        System.out.println(T.solution(n));
    }
}
