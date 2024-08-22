public class A476_Number_Complement {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(findComplement(num));
    }
    public static int findComplement(int num) {
        return binaryToNumber(stringNumberInverted(numberToBinary(num)));
    }
    public static String numberToBinary(int num){
        int sub = 1073741824;
        String numberS = "";
        int counter = 0;
        while(true){
            if (num - sub >= 0){
                num -= sub;
                sub /= 2;
                numberS += 1;
                counter++;
            }else{
                sub /= 2;
                if (counter > 0) {
                    numberS += 0;
                }
            }
            if (num == 0 && sub == 0) break;
        }
        System.out.println(numberS);
        return numberS;
    }
    public static String stringNumberInverted(String numberS){
        String invertedNumberS = "";
        for (int i = 0; i < numberS.length(); i++){
            if (numberS.charAt(i) == '0'){
                invertedNumberS += "1";
            }else {
                invertedNumberS += "0";
            }
        }
        System.out.println(invertedNumberS);
        return invertedNumberS;
    }
    public static int binaryToNumber(String numberS){
        int add = 1;
        int num = 0;
        for (int i = numberS.length() - 1; i >= 0; i--){
            if (numberS.charAt(i) == '1') {
                num += add;
            }
            add *= 2;
        }
        return num;
    }
}
