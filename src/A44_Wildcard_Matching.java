public class A44_Wildcard_Matching {
    public static void main(String[] args) {
        System.out.println(isMatch("aa","*"));
    }
    public static boolean isMatch(String s, String p) {
        if (s == null || p == null){return false;}
        boolean[][] map = new boolean[s.length()+1][p.length()+1];
        map[0][0] = true;
        for (int i = 0; i < p.length(); i++){
            if (p.charAt(i) == '*' ){
                map[0][i+1] = true;
            }
        }
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < p.length(); j++){
                if (p.charAt(j) == s.charAt(i)){
                    map[i+1][j+1] = map[i][j];
                }
                if (p.charAt(j) == '?'){
                    map[i+1][j+1] = map[i][j];
                }
                if (p.charAt(j) == '*'){
                    if (p.charAt(j-1) != s.charAt(i) && p.charAt(j-1) != '?'){
                        map[i+1][j+1] = map[i+1][j-1];
                    }else{
                        map[i+1][j+1] = (map[i+1][j] || map[i][j+1] || map[i+1][j-1]);
                    }
                }
            }
        }
        return map[s.length()][p.length()];
    }
}
