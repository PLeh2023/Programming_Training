import java.util.EmptyStackException;
import java.util.Stack;

public class A33_Longest_Valid_Parentheses {
    public static void main(String[] args) {
        String s = "()(()";
        System.out.println(longestValidParentheses(s));
    }
    public static int longestValidParentheses(String s) {
        int counter = 0;
        int result = 0;
        Stack stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                stack.push(s.charAt(i));
                continue;
            }
            try{
            stack.pop();
            counter++;
            }catch (Exception e){
                result = counter * 2;
            }

        }
        
        if (result / 2 < counter){
            result = counter * 2;
        }
        return result;
    }
}
