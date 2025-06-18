import java.util.Arrays;

public class A1920_Build_Array_from_Permutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    public static int[] buildArray(int[] nums) {
        int[] sol = new int[nums.length];
        int i = 0;
        for (int num : nums){
            sol[i] = nums[num];
            i++;
        }
        return sol;
    }
}
