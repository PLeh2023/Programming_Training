public class A27_Remove_Element {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,3));
    }
    public static int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }
}
