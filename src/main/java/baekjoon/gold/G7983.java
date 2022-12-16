package baekjoon.gold;

import java.io.*;
import java.util.*;

class Homework implements Comparable<Homework> {
    public int d, t;
    public int start, end;

    public Homework(int d, int t) {
        this.d = d;
        this.t = t;
    }

    public int compareTo(Homework hw) {
        return hw.t - this.t;
    }
}

public class G7983 {
    static int n;
    static Homework[] homeworks;
    static int maxDayCount;

    static void solution() {
        homeworks[0].end = homeworks[0].t;
        homeworks[0].start = homeworks[0].end - (homeworks[0].d - 1);

        for (int i = 1; i < n; i++) {
            homeworks[i].end = homeworks[i].t;
            homeworks[i].start = homeworks[i].end - (homeworks[i].d - 1);


            if (homeworks[i].end >= homeworks[i - 1].start) {
                homeworks[i].end = homeworks[i - 1].start - 1;
                homeworks[i].start = homeworks[i].end - (homeworks[i].d - 1);
            }
        }

        maxDayCount = homeworks[n - 1].start - 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        homeworks = new Homework[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            homeworks[i] = new Homework(d, t);
        }
        Arrays.sort(homeworks);
        solution();
        System.out.println(maxDayCount);
    }
}
