package lecture.A01_String;

import java.util.Scanner;

public class Main202 {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(x>=97 && x<=122){
                answer += (char)(x-32);
            }
            else answer += (char)(x+32);
        }
        return answer;
    }


    public static void main(String[] args) {
        Main202 T = new Main202();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
