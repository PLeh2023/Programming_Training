public class A7_Reverse_Integer {
    public static void main(String[] args) {
     int x = 123;
     System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        try {
            String tmp = "" + x;
            if (!tmp.contains("-")) {
                return Integer.parseInt(new StringBuilder(tmp).reverse().toString());
            } else {
                tmp = tmp.replace("-", "");
                String number = new StringBuilder(tmp).reverse().toString();
                return Integer.parseInt("-" + number);
            }
        }catch (NumberFormatException e){
            return 0;
        }
    }
}
