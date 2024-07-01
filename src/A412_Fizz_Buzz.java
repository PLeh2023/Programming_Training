import java.util.Arrays;

public class A412_Fizz_Buzz {
    public static void main(String[] args) {
        int input = 15;
        String[] output = new String[input];
        for (int i = 1; i <= input; i++){
            if (i % 3 == 0 && i % 5 == 0){
                output[i - 1] = "FizzBuzz";
            }else if (i % 3 == 0){
                output[i - 1] = "Fizz";
            }else if (i % 5 == 0){
                output[i - 1] = "Buzz";
            }else{
                output[i - 1] = ""+ i;
            }
        }
        System.out.println(Arrays.toString(output));
    }
}
