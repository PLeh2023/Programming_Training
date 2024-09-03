public class A67_Add_Binary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        String sum = "";
        int mark = 0;
        boolean greatestString = a.length() > b.length();
        int diff = greatestString ? a.length() - b.length() : b.length() - a.length();
        if (!(a.length() == b.length())) {
            if (greatestString) {
                b = fillString(diff, b);
            } else {
                a = fillString(diff, a);
            }
        }
        for (int i = a.length() - 1; i >= 0; i--) {
            boolean b1 = a.charAt(i) == '1' && b.charAt(i) == '1';
            boolean b2 = a.charAt(i) == '1' && b.charAt(i) == '0' || a.charAt(i) == '0' && b.charAt(i) == '1';
            if (mark == 0) {
                if (b1) {
                    sum = STR."0\{sum}";
                    mark = 1;
                } else if (b2) {
                    sum = STR."1\{sum}";
                } else {
                    sum = STR."0\{sum}";
                }
            }else{
                if (b1) {
                    sum = STR."1\{sum}";
                } else if (b2) {
                    sum = STR."0\{sum}";
                } else {
                    sum = STR."1\{sum}";
                    mark = 0;
                }
            }
        }
        if (mark == 1) sum = STR."1\{sum}";
        return sum;
    }
    public static String fillString (int diff, String z){
        for (int i = 0; i < diff; i++){
            z = STR."0\{z}";
        }
        return z;
    }
}
