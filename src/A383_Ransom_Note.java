import java.util.HashMap;

public class A383_Ransom_Note {
    public static void main(String[] args) {

        String ransomNote = "aabdsby";
        String magazine = "abdabdsbgsges";
        System.out.println(canConstruct(ransomNote,magazine));

    }
    public static boolean canConstruct(String ransomNote, String magazine){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++){
            char r = magazine.charAt(i);
            int counter = map.getOrDefault(r,0);
            map.put(r, counter + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++){
            char r = ransomNote.charAt(i);
            int counter = map.getOrDefault(r,0);
            if (counter == 0){
                return  false;
            }
            map.put(r,counter - 1);
        }
        return true;
    }
}
