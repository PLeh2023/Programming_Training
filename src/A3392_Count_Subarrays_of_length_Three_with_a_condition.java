public class A3392_Count_Subarrays_of_length_Three_with_a_condition {
    public static void main(String[] args) {
        int[] nums = {-1,-5,-1,5,1};
        System.out.println(countSubarrays(nums));
    }
    public static int countSubarrays(int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length-1; i++){
            if ((nums[i]&1) == 1) continue;
            if (nums[i-1]+nums[i+1] == nums[i]/2) sum++;
        }
        return sum;
    }
}
