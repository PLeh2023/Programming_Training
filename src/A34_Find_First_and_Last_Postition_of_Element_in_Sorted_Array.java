public class A34_Find_First_and_Last_Postition_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(searchRange(nums,target));
    }
    public static int[] searchRange(int[] nums, int target) {
        int counter = 0;
        int[] range = {-1,-1};
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                if (counter == 0){
                    range[0] = i;
                    counter++;
                }
                range[1] = i;
            }
        }
        return range;
    }
}
