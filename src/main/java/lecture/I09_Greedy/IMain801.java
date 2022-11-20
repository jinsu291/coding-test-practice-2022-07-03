package lecture.I09_Greedy;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
//★★
//ㅇ
public class IMain801 {
    private static class Edge implements Comparable<Edge> {
        public int vex;
        public int cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge ob) {
            return this.cost - ob.cost;
        }
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        int[] ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c)); // 무방향은 이것을 넣어줘야한다.
        }
        int answer = 0;
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(1, 0));
        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int ev = tmp.vex;
            if (ch[ev] == 0) {
                ch[ev] = 1;
                answer += tmp.cost;
                for (Edge ob : graph.get(ev)) {
                    if (ch[ob.vex] == 0) {
                        pQ.offer(new Edge(ob.vex, ob.cost));
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
