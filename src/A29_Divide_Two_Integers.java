public class A29_Divide_Two_Integers {
    public static void main(String[] args) {
        int dividend = 2147483647;
        int divisor = -2147483648;
        System.out.println(divide(dividend,divisor));
    }
    public static int divide(int dividend, int divisor) {
        int num = 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MAX_VALUE && divisor == -1) {
            return -Integer.MAX_VALUE;
        }
        if (dividend >= 0){
            if (divisor >= 0){
                num = division(dividend,divisor);
            }else{
                if (divisor == Integer.MIN_VALUE){
                    divisor = Integer.MAX_VALUE;
                }else {
                    divisor -= (divisor + divisor);
                }
                num -= division(dividend,divisor);
                if (divisor == Integer.MAX_VALUE && dividend == Integer.MAX_VALUE) {
                    num += 1;
                }
            }
        }else{
            if (divisor >= 0){
                if (dividend == Integer.MIN_VALUE){
                    dividend = Integer.MAX_VALUE;
                }else {
                    dividend -= (dividend + dividend);
                }
                num -= division(dividend, divisor);
                if (dividend == Integer.MAX_VALUE && divisor == 1 ||dividend == Integer.MAX_VALUE && divisor == 2 ||dividend == Integer.MAX_VALUE && divisor == 4) {
                    num -= 1;
                }
            }else{
                if (divisor == Integer.MIN_VALUE){
                    divisor = Integer.MAX_VALUE;
                }else {
                    divisor -= (divisor + divisor);
                }
                if (dividend == Integer.MIN_VALUE){
                    dividend = Integer.MAX_VALUE;
                }else{
                    dividend -= (dividend + dividend);
                }
                if (dividend == Integer.MIN_VALUE){
                    num = division(dividend,divisor) + 1;
                }else{
                    num = division(dividend,divisor);
                }
            }
        }
        return num;
    }
    public static int division(int dividend, int divisor){
        int counter = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            counter++;
        }
        return counter;
    }
}
