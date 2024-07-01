public class A3_Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String example = "ohomm";
        System.out.println(lengthOfLongestSubstring(example));
    }
    public static int lengthOfLongestSubstring(String s) {
        int counter = 0;
        int tmpCounter = 0;
        int betweenStringLength = 0;
        String comparedString = "";
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < comparedString.length(); j++) {
                if (comparedString.charAt(j) == s.charAt(i)){
                    if(counter < tmpCounter){counter = tmpCounter;}
                    tmpCounter = 0;
                    if (betweenStringLength < comparedString.length()){betweenStringLength = comparedString.length();}
                    comparedString = comparedString.substring(j + 1);
                }
            }
            tmpCounter++;
            comparedString += s.charAt(i);
        }
        if(counter < tmpCounter){counter = tmpCounter;}
        if(comparedString.length() > counter){counter = comparedString.length();}
        if(betweenStringLength > counter){counter = betweenStringLength;}
        return counter;
    }
}
