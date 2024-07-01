public class A1_Two_Sum {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == target - nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
