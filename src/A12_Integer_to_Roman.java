public class A12_Integer_to_Roman {
    public static void main(String[] args) {
    int num = 3749;
    System.out.println(intToRoman(num));
    }
    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] valuesToString = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String romanNumber = "";
        for (int i = 0; i < values.length; i++){
            if (num == 0){break;}
            while (num >= values[i]){
                num -= values[i];
                romanNumber += valuesToString[i];
            }
        }
        return romanNumber;
    }
}
