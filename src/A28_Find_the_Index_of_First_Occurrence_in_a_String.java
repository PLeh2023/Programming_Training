public class A28_Find_the_Index_of_First_Occurrence_in_a_String {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
