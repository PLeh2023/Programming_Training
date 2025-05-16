import java.util.Objects;

public class A2696_Minimum_String_Length_After_Removing_Substrings {
    public static void main(String[] args) {
        String s = "CCCCDDDD";
        System.out.println(minLength(s));
    }
    public static int minLength(String s) {
        int i = 0;
        while(i < s.length()){
            if(i+1 >= s.length()) break;
            if (Objects.equals("" + s.charAt(i) + s.charAt(i+1),"AB")){
                if (i == 0){
                    s = s.substring(i+2);
                } else if (i == s.length()-2) {
                    s = s.substring(0,i);
                }else{
                    s = s.substring(0,i) + s.substring(i+2);
                }
                i = 0;
                continue;
            }
            if (s.isEmpty())return 0;
            if (Objects.equals("" + s.charAt(i) + s.charAt(i+1),"CD")){
                if (i == 0){
                    s = s.substring(i+2);;
                } else if (i == s.length()-2) {
                    s = s.substring(0,i);
                }else{
                    s = s.substring(0,i) + s.substring(i+2);
                }
                i = 0;
                continue;
            }
            i++;
        }
        return s.length();
    }
}
