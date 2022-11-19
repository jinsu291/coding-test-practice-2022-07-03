package lecture.I09_Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//★
//ㅇ
public class IMain201 {
    //회의가 빨리 끝나는 것 기준으로 그리디로 하면 최대의 회의 수를 나타낼 수 있다.
    private static class Time implements Comparable<Time>{
        int s, e;
        public Time(int s, int e) {
            this.s = s;
            this.e = e;
        }
        @Override
        public int compareTo(Time o) {
            if (this.e == o.e) {
                return this.s - o.s; // 오름차순 정렬
            } else {
                return this.e - o.e;
            }
        }
    }

    private int solution(ArrayList<Time> arr, int n) {
        int cnt = 0;
        Collections.sort(arr); // 위의 Time 클래스에 맞게 정렬
        int et = 0;
        for (Time ob : arr) {
            if (ob.s >= et) {
                cnt++;
                et = ob.e;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        IMain201 T = new IMain201();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Time(x, y));
        }
        System.out.println(T.solution(arr, n));
    }
}
