import java.awt.*;
import java.util.Stack;

public class A20_Valid_Paratheses {
    public static void main(String[] args) {
        String s = "){";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        if (s.length() == 1){return false;}
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.empty()){return false;}
            if (stack.peek() == '(' && s.charAt(i) == ')' || stack.peek() == '[' && s.charAt(i) == ']' || stack.peek() == '{' && s.charAt(i) == '}'){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.empty();
    }
}
