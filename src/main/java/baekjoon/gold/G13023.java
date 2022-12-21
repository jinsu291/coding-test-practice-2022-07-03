package baekjoon.gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class G13023 {
    private static int m;
    private static ArrayList<Integer>[] list;
    private static int ans = 0;
    private static boolean[] v;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        m = M;

        list = new ArrayList[N];
        v = new boolean[N];
        for(int i = 0; i < N; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            list[n1].add(n2);
            list[n2].add(n1);
        }

        for(int i = 0; i < N; i++) {
            if(ans == 0)
                dfs(i, 1);
        }


        System.out.println(ans);
    }

    public static void dfs(int start, int depth) {
        if(depth == 5) {
            ans = 1;
            return;
        }

        v[start] = true;
        for(int i : list[start]) {
            int next = i;
            if(!v[next]) {
                dfs(next, depth+1);
            }
        }
        v[start] = false;
    }
}
