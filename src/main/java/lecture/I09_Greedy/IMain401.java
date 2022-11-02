package lecture.I09_Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
//★
//
public class IMain401 {
    private static class Lecture implements Comparable<Lecture> {
        int money;
        int time;

        public Lecture(int money, int time) {
            this.money = money;
            this.time = time;
        }

        @Override
        public int compareTo(Lecture ob) {
            return ob.time - this.time; // 내림차순
        }
    }
    static int n, max = Integer.MIN_VALUE;

    private int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        // 괄호 안에 아무것도 안넣을때 가장 작은 수가 나온다. 괄호 안에 넣었으니 가장 큰 수가 우선적으로 나온다.
        Collections.sort(arr);
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for ( ; j < n; j++) {
                if (arr.get(j).time < i) {
                    break;
                }
                if (!pQ.isEmpty()) {
                    answer += pQ.poll();
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        IMain401 T = new IMain401();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = kb.nextInt();
            int d = kb.nextInt();
            arr.add(new Lecture(m, d));
            if (d > max) {
                max = d;
            }
        }
        System.out.println(T.solution(arr));
    }
}
