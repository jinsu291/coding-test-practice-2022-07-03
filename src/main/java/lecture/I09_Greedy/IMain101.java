package lecture.I09_Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//ㅇㅇ
public class IMain101 {
    private static class Body implements Comparable<Body> {
        int h, w;
        public Body(int h, int w) {
            this.h = h;
            this.w = w;
        }
        @Override
        public int compareTo(Body o) {
            return o.h - this.h; // 음수 값 리턴(h에서 내림차순)
        }
    }

    private int solution(ArrayList<Body> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Body ob : arr) {
            if (ob.w > max) {
                max = ob.w;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        IMain101 T = new IMain101();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(T.solution(arr, n));
    }
}
