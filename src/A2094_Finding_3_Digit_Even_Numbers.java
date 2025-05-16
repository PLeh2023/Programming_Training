import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class A2094_Finding_3_Digit_Even_Numbers {
    public static void main(String[] args) {
        int[] digits = {2,1,3,0};
        System.out.println(Arrays.toString(findEvenNumbers(digits)));

    }
    public static int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> list = new HashSet<>(digits.length);
        for (int i = 0; i < digits.length; i++){
            for (int j = 0; j < digits.length; j++){
                for (int k = 0; k < digits.length; k++){
                    if (i == j || i == k || j == k) continue;
                    list.add(Integer.parseInt(""+digits[i] + digits[j] + digits[k]));
                }
            }
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int num : list){
            if (isEven(num) && num >= 100) {
                list1.add(num);
            }
        }
        int[] ints = new int[list1.size()];
        int i = 0;
        for (int num : list1){
            ints[i] = num;
            i++;
        }
        Arrays.sort(ints);
        return ints;
    }
    public static boolean isEven(int num){
        return (num & 1) != 1;
    }
}
