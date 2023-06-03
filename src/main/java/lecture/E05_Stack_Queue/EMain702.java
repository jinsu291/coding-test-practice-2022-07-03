package lecture.E05_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class EMain702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x : str1.toCharArray()) {
            Q.offer(x);
        }
        for (char x : str2.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll()) {
                    answer = "NO";
                    break;
                }
            }
        }
        if (!Q.isEmpty()) {
            answer = "NO";
        }
        System.out.println(answer);
    }
}
