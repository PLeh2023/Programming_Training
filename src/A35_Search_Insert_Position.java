public class A35_Search_Insert_Position {
    public static void main(String[] args) {
        int[] nums = {1,3,5};
        int target = 4;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]){return nums.length;}
        for (int i = 0; i < nums.length; i++){
            if (nums[i] >= target){
                return i;
            }
        }

       return 0;
    }
}
