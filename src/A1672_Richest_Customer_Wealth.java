public class A1672_Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] input = {{1, 1, 3},{2, 8, 7},{1, 9, 5}};
        int max_wealth = 0;
        for (int i = 0; i < input.length; i++){
            int tmp = 0;
            for (int j = 0; j < input[i].length; j++){
                 tmp += input[i][j];
                 if (tmp > max_wealth){
                     max_wealth = tmp;
                 }
            }
        }
        System.out.println(max_wealth);
    }
}
