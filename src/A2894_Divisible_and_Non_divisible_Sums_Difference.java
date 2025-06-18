import java.util.ArrayList;
import java.util.List;

public class A2894_Divisible_and_Non_divisible_Sums_Difference {
    public static void main(String[] args) {
        int n = 10, m = 3;
        System.out.println(differenceOfSums(n,m));
    }
    public static int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i < n+1; i++) {
            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }
        return num1 - num2;
    }
    /* // over engineered
    public static int differenceOfSums(int n, int m) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 1; i < n+1; i++){
            if (i % m == 0){
                list2.add(i);
            }else{
                list1.add(i);
            }
        }
        return list1.stream().mapToInt(Integer::intValue).sum() - list2.stream().mapToInt(Integer::intValue).sum();
    }
    */
}
