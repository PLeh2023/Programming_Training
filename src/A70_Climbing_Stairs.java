public class A70_Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
    public static int climbStairs(int n) {
        if (n <= 1) return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    public static int climbStairs2(int n) {
        if (n <= 1) return 1;

        int a = 1; // Anzahl Wege für Stufe 0
        int b = 1; // Anzahl Wege für Stufe 1

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
