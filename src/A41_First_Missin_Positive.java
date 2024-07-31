import java.util.Arrays;

public class A41_First_Missin_Positive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int counter = 1;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] <= 0){continue;}
            if (i > 0 &&nums[i] == nums[i - 1]){continue;}
            if (counter == nums[i]){
                counter++;
            }else{
                break;
            }
        }
        return counter;
    }
}
