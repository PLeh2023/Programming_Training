import java.util.*;

public class A118_Pascals_Trianlge {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        rows.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < rows.size(); j++) {
                if (j == 0) {
                    tmp.add(1);
                }
                if (i == 1) {
                    tmp.add(1);
                    break;
                }
                List<Integer> tmp2 = rows.get(i - 1);

                if (j + 1 >= rows.get(i - 1).size()) {
                    tmp.add(1);
                    break;
                }
                tmp.add(tmp2.get(j) + tmp2.get(j + 1));

            }
            rows.add(tmp);
        }
        return rows;
    }
}
