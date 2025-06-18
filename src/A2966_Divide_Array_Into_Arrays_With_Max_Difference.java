import java.util.Arrays;

public class A2966_Divide_Array_Into_Arrays_With_Max_Difference {
    public static void main(String[] args) {
        int[] nums = {2,4,2,2,5,2};
        int k = 2;
        System.out.println(Arrays.deepToString(divideArray(nums, k)));
    }
    public static int[][] divideArray(int[] nums, int k) {
        int length = nums.length;
        int[][] myArrays = new int[length/3][3];
        nums = Arrays.stream(nums).sorted().toArray();
        int j = 0;
        int l = 0;
        for (int i = 0; i < length; i++){
            if (l == 3){
                if (!isValid(k, myArrays[j][0], myArrays[j][2]))return new int[][]{};
                j++;
                l = 0;
            }
            myArrays[j][l] = nums[i];
            l++;
        }
        if (!isValid(k, myArrays[j][0], myArrays[j][2]))return new int[][]{};
        return myArrays;
    }
    public static boolean isValid(int k, int num1, int num2){
        return num2 - num1 <= k;
    }
}
