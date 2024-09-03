public class A69_Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
    }
    public static int mySqrt(int x) {
        if (x == 1) return 1;
        if (x == 2) return 1;
        for (int i = 0; i < x; i++){
            if ((i * i) > x || i * i < 0) return i - 1;
        }
        return 0;
    }
}
