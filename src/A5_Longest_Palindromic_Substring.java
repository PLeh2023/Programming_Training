public class A5_Longest_Palindromic_Substring {
    public static void main(String[] args) {
        String s = "abad";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        String maxLength = "";
        for (int i = s.length(); i > 0; i--){
            for (int j = 0; j < i;j++){
                if (s.charAt(i - 1) != s.charAt(j)){continue;}
                String tmp = s.substring(j,i);
                if (isPalindrom(tmp)){
                    if (tmp.length() > maxLength.length()){
                        maxLength = tmp;
                    }
                }
                if (maxLength.length() > s.length()/2){break;}
            }
        }
        return maxLength;
    }
    public static boolean isPalindrom(String s){
        String revS = new StringBuilder(s).reverse().toString();
        return revS.equals(s);
    }
}
