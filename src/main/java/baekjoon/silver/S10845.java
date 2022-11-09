package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> Q = new LinkedList<>();
        int k = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch(s) {
                case "push" :
                    k = Integer.parseInt(st.nextToken());
                    Q.offer(k);
                    break;
                case "pop" :
                    if(Q.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(Q.poll()).append("\n");
                    break;
                case "size" :
                    sb.append(Q.size()).append("\n");
                    break;
                case "empty" :
                    if(Q.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front" :
                    if(Q.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(Q.peek()).append("\n");
                    break;
                case "back" :
                    if(Q.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(k).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
