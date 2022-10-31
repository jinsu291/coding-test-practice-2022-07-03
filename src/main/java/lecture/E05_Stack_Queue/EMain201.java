package lecture.E05_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

//ㅇ
public class EMain201 {
    public String  solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if (x == ')'){
                while (stack.pop() != '('); // 여는 괄호까지 돌리고 여는괄호가 거짓이 되니 멈춘다. 
            }
            else stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++){
            answer += stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        EMain201 T = new EMain201();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
