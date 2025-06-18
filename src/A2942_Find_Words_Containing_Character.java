import java.util.ArrayList;
import java.util.List;

public class A2942_Find_Words_Containing_Character {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>(words.length);
        int i = 0;
        for (String word : words){
            if (word.indexOf(x) != -1){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}
