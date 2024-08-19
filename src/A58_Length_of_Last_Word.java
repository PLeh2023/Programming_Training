public class A58_Length_of_Last_Word {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int lengthCounter = 0;
        int breaker = -1;
        String character = "\\w";
        String space = " ";
        for (int i = 0; i < s.length(); i++){
            if ((STR."\{s.charAt(i)}").matches(character) && breaker == -1){
                lengthCounter++;
            }else if((STR."\{s.charAt(i)}").matches(space)){
                breaker = 0;
            }else {
                lengthCounter = 1;
                breaker = -1;
            }

        }
        return lengthCounter;
    }
}
