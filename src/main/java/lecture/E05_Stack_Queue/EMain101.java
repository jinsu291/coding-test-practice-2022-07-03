package lecture.E05_Stack_Queue;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

// 어려움 다시보기!!
public class EMain101 {
    public String  solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()){
            if( x == '(') {
                stack.push(x);
            }
            else {
                if(stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) {
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        EMain101 T = new EMain101();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
