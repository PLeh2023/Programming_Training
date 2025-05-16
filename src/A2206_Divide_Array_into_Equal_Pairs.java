import java.util.HashMap;
import java.util.Map;

public class A2206_Divide_Array_into_Equal_Pairs {
    public static void main(String[] args) {

    }
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for (int num : nums){
            map.merge(num, 1, Integer::sum);
        }
        for (Map.Entry<Integer,Integer> pair: map.entrySet()){
            if ((pair.getValue()&1) == 1) return false;
        }
        return true;
    }
}
