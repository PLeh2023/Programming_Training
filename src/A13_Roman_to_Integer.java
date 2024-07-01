public class A13_Roman_to_Integer {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (romanletterInInt(s.charAt(i)) >= romanletterInInt(s.charAt(i + 1))) {
                num += romanletterInInt(s.charAt(i));
            } else {
                num -= romanletterInInt(s.charAt(i));
            }
        }
        num += romanletterInInt(s.charAt(s.length() - 1));
        return num;
    }
    public static int romanletterInInt(char c){
        return switch (c){
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }
}
