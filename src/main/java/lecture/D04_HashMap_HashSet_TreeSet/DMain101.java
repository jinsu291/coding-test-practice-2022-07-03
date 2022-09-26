package lecture.D04_HashMap_HashSet_TreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// 어려움 다시보기!!
public class DMain101 {
    public char solution(int n, String s){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()){
            if (map.get(key) > max){
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
