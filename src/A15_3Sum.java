import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A15_3Sum {
    public static void main(String[] args) {
        int[] nums = {0,0,0};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[start] + nums[end];
                if (sum == target) {
                    list.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    end--;
                    start++;
                    while (start < end && nums[start] == nums[start - 1]) start++;
                    while (start < end && nums[end] == nums[end + 1]) end--;
                } else if (sum > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return list;
    }
}
