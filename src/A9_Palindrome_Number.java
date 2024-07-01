public class A9_Palindrome_Number {
    public static void main(String[] args) {
        int x = 1212;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        String number = "" + x;
        if (number.contains("-")){return false;}
        int start = 0;
        int end = number.length() - 1;
        while(start < end){
            if(number.charAt(start) == number.charAt(end)){
                start++;
                end--;
            }else{return false;}
        }
        return true;
    }
}
