public class A3024_Type_of_Triangle {
    public String triangleType(int[] nums) {
        int x = nums[0];
        int y = nums[1];
        int z = nums[2];
        if (x == y && x == z) return "equilateral";
        if (x + y > z && x + z > y && y + z > x) {
            if (x == y || x == z || y == z) return "isosceles";
            else return "scalene";
        }else return "none";
    }
}
