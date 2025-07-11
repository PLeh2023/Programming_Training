import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class A1394_Find_Lucky_Integer_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4};
        System.out.println(findLucky(arr));
    }
    /*
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
    }*/
    public static int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int largestLuckyNum = -1;
        for (int num : arr){
            map.put(num,map.getOrDefault(num,0) +1);
        }
        for (Map.Entry<Integer,Integer> y : map.entrySet()){
            int key = y.getValue();
            if (Objects.equals(key, y.getKey())) {
                if (key > largestLuckyNum) largestLuckyNum = key;
            }
        }
        return largestLuckyNum;
    }
}
