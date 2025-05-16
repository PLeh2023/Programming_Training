import java.util.Stack;

public class A1957_Delete_Characters_to_Make_Fancy_String {
    public static void main(String[] args) {
        String s = "leeetcode";
        System.out.println(makeFancyString(s));
    }
    public static String makeFancyString(String s) {
        StringBuilder s2 = new StringBuilder();
        int end = 0;
        for (int i = 0; i < s.length(); i++){
            try {
                if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)) {
                    end = i + 2;
                    try {
                        while (s.charAt(i) == s.charAt(end)) {
                            end++;
                        }
                    } catch (Exception _) {
                    }
                    s2.append(s.charAt(i));
                    s2.append(s.charAt(i));
                    i = end;
                    i--;
                    continue;
                }
            }catch (Exception _){}
                s2.append(s.charAt(i));
        }
        return s2.toString();
    }
    /*
    // Big O n
    public static String makeFancyString(String s) {
        int end = 0;
        for (int i = 0; i < s.length(); i++){
            try {
                if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)) {
                    end = i + 2;
                    try {
                        while (s.charAt(i) == s.charAt(end)) {
                            end++;
                        }
                    } catch (Exception _) {
                    }
                    s = s.substring(0, i + 2) + s.substring(end);
                }
            }catch (Exception _){}

        }
        return s;
    }
    // Big O n^2
    public static String makeFancyString(String s) {
        for (int i = 0; i < s.length(); i++){
            try {
                while(s.charAt(i) == s.charAt(i+1) && s.charAt(i) == s.charAt(i+2)){

                    s = s.substring(0, i + 2) + s.substring(i + 3);
                }
            }catch (Exception _){}
        }
        return s;
    }
    // Big O n^2
    public static String makeFancyString(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if (stack.empty()){
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.peek() == s.charAt(i)){
                stack.push(s.charAt(i));
            }else{
                stack.clear();
                stack.push(s.charAt(i));
            }
            if (stack.size() == 3){
                s = s.substring(0,i) + s.substring(i+1);
                stack.pop();
                i--;
            }
        }
        return s;
    }

     */
}
