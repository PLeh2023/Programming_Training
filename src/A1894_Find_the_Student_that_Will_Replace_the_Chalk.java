import java.util.Arrays;

public class A1894_Find_the_Student_that_Will_Replace_the_Chalk {
    public static void main(String[] args){
        int[] chalk = {3,4,1,2};
        int k = 539095482;
        System.out.println(chalkReplacer(chalk,k));
    }
    public static int chalkReplacer(int[] chalk, int k) {
        long sum = Arrays.stream(chalk).mapToLong(n -> (long) n).sum();
        k %= sum;
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) return i;
            k -= chalk[i];
        }
        return 0;
    }
}
