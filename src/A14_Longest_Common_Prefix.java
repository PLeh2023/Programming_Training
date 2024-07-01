import java.util.Objects;

public class A14_Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int counter = 0;
        int loops = 0;
       try {
           if (strs.length > strs[0].length()){
               loops = strs.length;
           }else {
               loops = strs[0].length();
           }
           for (int i = 0; i < loops; i++) {
               try {
                   if (Objects.equals(strs[i], "")) {break;}
               }catch (Exception _){}
               for (int j = 1; j < strs.length; j++) {
                   char compare = strs[j - 1].charAt(i);
                   if (compare == strs[j].charAt(i)) {
                       counter++;
                   }
               }
               if (counter != strs.length - 1) {
                   break;
               }
               counter = 0;
               prefix += strs[0].charAt(i);
           }
       }catch (Exception ignore){}
        return prefix;
    }
}
