public class A860_Lemonade_Change {
    public static void main(String[] args) {
        int[] bills = {5,5,5,5,20,20,5,5,20,5};
        System.out.println(lemonadeChange(bills));
    }
    public static boolean lemonadeChange(int[] bills) {
        int[] money = new int[3];
        for (int i = 0; i < bills.length; i++){
            switch (bills[i]){
                case 5 : money[0] += 1;break;
                case 10 : money[1] += 1;
                          money[0] -= 1;
                                        break;
                case 20 : money[2] += 1;
                        if (money[1] - 1 >= 0){
                            money[1] -= 1;
                            money[0] -= 1;
                        }else {
                            money[0] -= 3;
                        }
                                        break;
            }
            if (money[0] < 0 || money[1] < 0) return false;
        }
        return true;
    }
}
