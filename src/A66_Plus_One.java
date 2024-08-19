import java.util.Arrays;

public class A66_Plus_One {
    public static void main(String[] args) {
        int[] digits = {8,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        int i = digits.length-1;
        try {
            while (true) {
                if (digits[i] + 1 == 10) {
                    digits[i] = 0;
                    i--;
                } else {
                    digits[i] += 1;
                    break;
                }
            }
        }catch (Exception e){
            int[] digits2 = new int[digits.length + 1];
            digits2[0] = 1;
            return digits2;
        }
        return digits;
    }
}
