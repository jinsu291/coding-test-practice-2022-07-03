package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class G1374 {
    private static class Time implements Comparable<Time> {
        int time;
        char state;

        public Time(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time o) {
            if (this.time == o.time) {
                return this.state - o.state;
            } else {
                return this.time - o.time;
            }
        }
    }

    private int solution(ArrayList<Time> arr) {
        int answer = 0;
        Collections.sort(arr);
        int cnt = 0;
        for (Time ob : arr) {
            if (ob.state == 's') {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }
        if (answer != 0) {
            return answer;
        } else {
            return 1;
        }
        }

    public static void main(String[] args) throws IOException {
        G1374 T = new G1374();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr.add(new Time(b, 's'));
            arr.add(new Time(c, 'e'));
        }
        System.out.println(T.solution(arr));
    }
}
