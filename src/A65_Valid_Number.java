import java.util.Objects;

public class A65_Valid_Number {
    public static void main(String[] args) {
        String s = "959440.94f";
        System.out.println(isNumber(s));
    }
    public static boolean isNumber(String s) {
        String nN = "";
        String eN = "";
        String[] tmp;
        if (s.matches(".*e.*e.*") || s.matches(".*[a-df-z].*")){
            return false;
        }
        if (s.contains("e")){
            tmp = s.split("e");
            nN = tmp.length > 0 ? tmp[0] : "";
            eN = tmp.length > 1 ? tmp[1] : "";
        } else if (s.contains("E")) {
            tmp = s.split("E");
            nN = tmp.length > 0 ? tmp[0] : "";
            eN = tmp.length > 1 ? tmp[1] : "";
        }
        if (Objects.equals(nN,"")){
            nN = s;
        }
        if (s.contains("e") || s.contains("E"))
            return normalNumber(nN) && exponentialNumber(eN);
        else
            return normalNumber(nN);
    }
    public static boolean exponentialNumber(String eN){
        try {
            long num = Long.parseLong(eN);
        }catch (Exception e){
            return false;
        }
        return true;
    }
    public static boolean normalNumber(String nN){
        long numI;
        double numD;
        try {
            if (nN.contains(".")){
                numD = Double.parseDouble(nN);
            }else{
                numI = Long.parseLong(nN);
            }
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
