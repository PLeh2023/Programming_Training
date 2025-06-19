import java.util.Arrays;

public class A2294_Partition_Array_Such_That_Maximum_Difference_Is_K {
    public static void main(String[] args) {
        int[] nums = {3,6,1,2,5};
        int k = 2;
        System.out.println(partitionArray(nums,k));
    }
    public static int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++){
            int maxValue = nums[i] + k;
            while(!(i == length) && nums[i] <= maxValue){
                i++;
            }
            i--;
            n++;
        }
        return n;
    }
}
