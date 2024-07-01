import java.util.LinkedList;

public class A876_Middle_of_The_Linked_List {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int start = list.size()/2;
        for (int i = start; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
