public class A2016_Maximum_Difference_Between_Increasing_Elements {
    public static void main(String[] args) {

    }
    public int maximumDifference(int[] nums) {
        int max = -1;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i +1; j < length; j++) {
                int tmp = nums[j] - nums[i];
                if (tmp > max) max = tmp;
            }
        }
        if (max == 0) return -1;
        return max;
    }
}
