public class A16_3Sum_Closet {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
    public static int threeSumClosest(int[] nums, int target) {
        int distance = Integer.MAX_VALUE;
        int bestSum = 0;
        //start
        for (int i = 0; i < nums.length; i++){
            //end
            for (int j = nums.length - 1; j > 0;j--){
                //runner
                for (int k = 0; k < nums.length; k++){
                    if (k == i || k == j || i == j){continue;}
                    if (j < k){break;}
                    int tmp = nums[i] + nums[j] + nums[k];
                    if (tmp == target){return tmp;}
                    int diff = 0;
                    diff = Math.abs(tmp - target);
                    if (diff < distance){
                        distance = diff;
                        bestSum = tmp;
                    }
                }
            }
        }
        return bestSum;
    }
}
