public class A1295_Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int sum = 0;
        for(int num : nums){
            if(((""+num).length()&1) != 1)
                sum++;
        }
        return sum;
    }
}
