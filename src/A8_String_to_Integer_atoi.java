public class A8_String_to_Integer_atoi {
    public static void main(String[] args) {
        String s = "+-12";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        String newString = "";
        int counter = 0;
        for (int i = 0; i < s.length(); i++){
            String tmp = "" + s.charAt(i);
            if (tmp.equals(" ") && counter == 0){continue;}
            if (tmp.contains("+") && counter == 0){
                newString = tmp;
                counter++;
            }else if(tmp.contains("-") && counter == 0){
                newString = tmp;
                counter++;
            }else if (tmp.matches("[0-9]")){
                newString += tmp;
                counter++;
            }else{
                break;
            }
        }
        if (counter == 0){return 0;}
        if (counter == 1 && newString.contains("+") || counter == 1 && newString.contains("-")){return 0;}
        try {
            return Integer.parseInt(newString);
        }catch(Exception e){
            if (!newString.contains("-")) {
                return Integer.MAX_VALUE;
            }else{
                return Integer.MIN_VALUE;
            }
        }
    }
}
