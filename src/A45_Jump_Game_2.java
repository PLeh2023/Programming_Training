public class A45_Jump_Game_2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(jump(nums));
    }
    public static int jump(int[] nums) {
        int position = 0;
        int jumps = 0;
        int farthest = 0;
        int tmpP = 0;
        while(position < nums.length - 1){
            if (nums[position] + position >= nums.length - 1 ){
                jumps++;
                break;
            }
            for (int i = position + 1; i <= position + nums[position]; i++){
                if (nums[i] + i >= farthest){
                    farthest = nums[i] + i;
                    tmpP = i;
                }
            }
            position = tmpP;
            jumps++;
            farthest = 0;
        }
        return jumps;
    }
}
