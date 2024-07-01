public class A10_Regular_Expression_Matching {
    public static void main(String[] args) {
    String s = "abc";
    String p = "a***abc";
    System.out.println(isMatch(s,p));
    }
    public static boolean isMatch(String s, String p) {
        p = p.replace("***","*");
        return s.matches(p);
    }
}
