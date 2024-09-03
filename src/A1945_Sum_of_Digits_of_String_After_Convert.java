public class A1945_Sum_of_Digits_of_String_After_Convert {
    public static void main(String[] args) {
        String s = "iiii";
        int k = 1;
        System.out.println(getLucky(s,k));
    }
    public static int getLucky(String s, int k) {
        String tmp = convertStringToStringnumber(s);
        for (int i = 0; i < k; i++) {
            tmp = sumOfDigits(tmp);
        }
        return Integer.parseInt(tmp);
    }
    public static String convertStringToStringnumber(String s){
        StringBuilder newS = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                case 'a': newS.append("1");break;
                case 'b': newS.append("2");break;
                case 'c': newS.append("3");break;
                case 'd': newS.append("4");break;
                case 'e': newS.append("5");break;
                case 'f': newS.append("6");break;
                case 'g': newS.append("7");break;
                case 'h': newS.append("8");break;
                case 'i': newS.append("9");break;
                case 'j': newS.append("10");break;
                case 'k': newS.append("11");break;
                case 'l': newS.append("12");break;
                case 'm': newS.append("13");break;
                case 'n': newS.append("14");break;
                case 'o': newS.append("15");break;
                case 'p': newS.append("16");break;
                case 'q': newS.append("17");break;
                case 'r': newS.append("18");break;
                case 's': newS.append("19");break;
                case 't': newS.append("20");break;
                case 'u': newS.append("21");break;
                case 'v': newS.append("22");break;
                case 'w': newS.append("23");break;
                case 'x': newS.append("24");break;
                case 'y': newS.append("25");break;
                case 'z': newS.append("26");break;
            }
        }
        return newS.toString();
    }
    public static String sumOfDigits(String s){
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            sum += Integer.parseInt(STR."\{s.charAt(i)}");
        }
        return STR."\{sum}";
    }
}
