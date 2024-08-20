public class A509_Fibonaci_Number {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        int nr1 = 1;
        int nr2 = 1;
        if (n == 0)return 0;
        for (int i = 1; i < Math.ceil((double)n/2); i++){
            nr1 = nr1 + nr2;
            nr2 = nr1 + nr2;
        }
        if (n % 2 == 0){
            return nr2;
        }else
        return nr1;
    }
}
