
public class A26_Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int counter = 0;
        for(int i = 1; i < nums.length; i++){
            if (nums[counter] != nums[i]){
                counter++;
                nums[counter] = nums[i];
            }
        }
        return counter + 1;
    }
}
