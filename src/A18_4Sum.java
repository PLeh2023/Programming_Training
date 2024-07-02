import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A18_4Sum {
    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        System.out.println(fourSum(nums,target));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++) {
                int start = j + 1, end = nums.length - 1;
                while (start < end) {
                    int sum = nums[i] + nums[j] + nums[start] + nums[end];
                    if (target < 0 && nums[i] > 0 && nums[j] > 0 && nums[start] > 0 && nums[end] > 0){break;}
                    if(sum == target){
                        ArrayList<Integer> tmp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        if (!list.contains(tmp))
                        list.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        start++;
                        end--;
                        while (start < end && nums[start] == nums[start - 1]) start++;
                        while (start < end && nums[end] == nums[end + 1]) end--;
                    }else if (sum > target) {
                    end--;
                    } else {
                    start++;
                    }
                }
            }
        }
        return list;
    }
}
