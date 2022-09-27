package lecture.E05_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

// 어려움 다시보기!!
public class EMain501 {
    public int solution(String str){
        int cnt = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '('){
                stack.push('(');
            } else {
                stack.pop();
                if (str.charAt(i - 1) == '(') {
                    cnt += stack.size();
                } else {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        EMain501 T = new EMain501();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
