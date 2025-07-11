public class A1394_Find_Lucky_Integer_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4};
        System.out.println(findLucky(arr));
    }
    public static int findLucky(int[] arr) {
        int largestLuckyNum = -1;
        for (int num : arr){
            int count = 0;
            for (int num2 : arr){
                if (num == num2) count++;
            }
            if (count == num && num > largestLuckyNum) largestLuckyNum = num;
        }
        return largestLuckyNum;
    }
}
