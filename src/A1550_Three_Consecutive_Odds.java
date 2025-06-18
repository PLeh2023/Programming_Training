public class A1550_Three_Consecutive_Odds {
    public static void main(String[] args) {
       int[] arr = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));
    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        int sum = 0;
        for (int num : arr){
            if ((num&1) ==1){
                sum++;
                if (sum >= 3) return true;
            }else{
                sum = 0;
            }
        }
        return false;
    }
}
