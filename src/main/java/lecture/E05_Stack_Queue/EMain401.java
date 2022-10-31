package lecture.E05_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;
//★
//ㅇ
public class EMain401 {
    public int solution(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()){
            if (Character.isDigit(x)){
                stack.push(x - 48); // 48을 빼주어야 실제로 숫자가 된다.
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') {
                    stack.push(lt+rt);
                } else if(x == '-') {
                    stack.push(lt-rt);
                } else if(x == '*') {
                    stack.push(lt*rt);
                } else if(x == '/') {
                    stack.push(lt/rt);
                }
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        EMain401 T = new EMain401();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
