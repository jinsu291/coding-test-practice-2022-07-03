package lecture.F06_Sorting_and_Searching;

import java.util.*;

//★
//ㅇㅇ
public class FMain701 {
    private static class Point implements Comparable<Point> {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) {
                return this.y - o.y; // 오름차순, 이해안되면 외울것!!
            } else {
                return this.x - o.x;
            }
        }
    }

    public static void main(String[] args) {
        FMain701 T = new FMain701();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for (Point o : arr) {
            System.out.println(o.x + " " + o.y);
        }
    }
}
