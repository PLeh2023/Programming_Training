import java.util.Arrays;

public class A1480_Running_Sum_of_1D_Array {
    public static void main(String[] args) {
        int[] input = {3,1,2,10,1};
        for (int i = 1; i < input.length; i++){
            input[i] += input[i - 1];
        }
        System.out.println(Arrays.toString(input));
    }
}
