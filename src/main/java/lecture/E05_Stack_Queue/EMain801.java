package lecture.E05_Stack_Queue;

import java.io.IOException;
import java.util.*;
//★
//ㅇㅇ
public class EMain801 {
    private class Person {
        int id;
        int priority;
        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    private int solution(int n, int k, int[] arr) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, arr[i]));
        }
        while (!Q.isEmpty()) {
            Person tmp = Q.poll(); // tmp라는 사람을 처음 꺼내서 이 사람이 진료를 받을 수 있는지 확인해야함
            for (Person x : Q) { // 25 ~ 31 받을 수 있는지 꺼내보면서 확인하는 작업
                if (x.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == k){
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        EMain801 T = new EMain801();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}