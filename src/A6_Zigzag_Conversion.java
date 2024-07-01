public class A6_Zigzag_Conversion {
    public static void main(String[] args) {
        String s = "Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers.";
        int numRows = 10;
        System.out.println(convert(s,numRows));
    }
    public static String convert(String s, int numRows) {
        int jumps;
        if(numRows == 1){
            return s;
        }else if (numRows == 2) {
            jumps = numRows;
        }else {
            jumps = numRows + numRows - 2;
        }
        String zigzagString = "";
        for (int k = 0; k < numRows; k++) {
            int counter = 0;
            if (k == 0 || k == numRows - 1) {
                for (int j = k; j < s.length(); j += jumps) {
                    zigzagString += s.charAt(j);
                }
            }else{
                for(int i = k; i < s.length(); i += jumps - 2 * k){
                    zigzagString += s.charAt(i);
                    if (counter >= 1) {
                        i += 2 * k;
                        if (i >= s.length()) {break;}
                        zigzagString += s.charAt(i);
                    }
                    counter++;
                }
            }
            counter = 0;
        }
        return zigzagString;
    }
}