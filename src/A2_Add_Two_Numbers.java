import java.util.LinkedList;

public class A2_Add_Two_Numbers {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        l2.add(5);
        l2.add(6);
        l2.add(4);
        System.out.println(addTwoNumbers(l1,l2));


    }
    public static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2){

        String tmp = "";
        int num1 = 0;
        int num2 = 0;
        LinkedList<Integer> l3 = new LinkedList<>();
        for (int i = l1.size(); i > 0; i--){
            tmp += l1.get(i - 1);
        }
        num1 = Integer.parseInt(tmp);
        tmp = "";
        for (int i = l2.size(); i > 0; i--){
            tmp += l2.get(i - 1);
        }
        num2 = Integer.parseInt(tmp);
        num1 += num2;
        tmp = "";
        tmp = "" + num1;
        for (int i = tmp.length(); i > 0; i--){
           l3.add(Integer.parseInt("" + tmp.charAt(i - 1)));
        }
        return l3;
    }
}
