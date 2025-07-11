public class A367_Valid_Perfect_Square {
    public static void main(String[] args) {
        int num = 15;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        String txt= String.valueOf(Math.sqrt(num));
        return txt.matches(".*\\.0");
    }
}
