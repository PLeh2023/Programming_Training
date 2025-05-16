import java.util.Objects;

public class A3335_Total_Characters_in_String_After_Transformations_I {
    public static void main(String[] args) {
        String s = "abcyy";
        int t = 2;
        System.out.println(lengthAfterTransformations(s,t));
    }
    private static final int MOD = 1_000_000_007;

    public static int lengthAfterTransformations(String s, int t) {
        // Zähle, wie oft jeder Buchstabe am Anfang vorkommt
        long[] freq = new long[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Führe t Transformationen durch
        for (int i = 0; i < t; i++) {
            long[] nextFreq = new long[26];

            for (int j = 0; j < 26; j++) {
                if (j == 25) { // 'z'
                    nextFreq[0] = (nextFreq[0] + freq[25]) % MOD; // 'a'
                    nextFreq[1] = (nextFreq[1] + freq[25]) % MOD; // 'b'
                } else {
                    nextFreq[j + 1] = (nextFreq[j + 1] + freq[j]) % MOD;
                }
            }

            freq = nextFreq;
        }

        // Summiere alle Zeichenanzahlen auf
        long total = 0;
        for (long count : freq) {
            total = (total + count) % MOD;
        }

        return (int) total;
    }
    /* zu langsam :(
    public static int lengthAfterTransformations(String s, int t) {
        String[][] map = {
                {"a", "b"},
                {"b", "c"},
                {"c", "d"},
                {"d", "e"},
                {"e", "f"},
                {"f", "g"},
                {"g", "h"},
                {"h", "i"},
                {"i", "j"},
                {"j", "k"},
                {"k", "l"},
                {"l", "m"},
                {"m", "n"},
                {"n", "o"},
                {"o", "p"},
                {"p", "q"},
                {"q", "r"},
                {"r", "s"},
                {"s", "t"},
                {"t", "u"},
                {"u", "v"},
                {"v", "w"},
                {"w", "x"},
                {"x", "y"},
                {"y", "z"},
                {"z", "ab"}
        };
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            String curChar = ""+s.charAt(i);
            for (String[] strings : map) {
                if (Objects.equals(strings[0], curChar)) {
                    stringBuilder.append(strings[1]);
                    break;
                }
            }
        }
        if (t == 1) {
            return stringBuilder.length();
        }
        return lengthAfterTransformations(stringBuilder.toString(),t-1);
    }*/
}
