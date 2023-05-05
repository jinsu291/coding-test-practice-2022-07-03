package lecture.D04_HashMap_HashSet_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

//ㅇㅇ
public class DMain101 {
    public char solution(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {  // key를 탐색한다.
//            System.out.println(key + " " + map.get(x)); // 키 출력
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        DMain101 T = new DMain101();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}
