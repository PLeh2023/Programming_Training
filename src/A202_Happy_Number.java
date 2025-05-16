public class A202_Happy_Number {
    public static void main(String[] args) {

    }
    public static boolean isHappy(int n) {
        for (int i = 0; i < 10000; i++){
            if(n == 1) return true;
            n = traverseNumber(""+n);
        }
        return false;
    }
    public static int traverseNumber(String number){
        int n = 0;
        for (int i = 0; i < number.length(); i++){
            int tmp = Integer.parseInt(""+number.charAt(i));
            n += tmp * tmp;
        }
        return n;
    }
}
