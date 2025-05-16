import com.sun.net.httpserver.Authenticator;

import javax.xml.transform.Result;
import java.math.BigInteger;

public class A43_Multiply_Strings {
    public static void main(String[] args) {
        String num1 = "498828660196";
        String num2 = "840477629533";
        System.out.println(multiply(num1,num2));
    }
    public static String multiply(String num1, String num2) {
        BigInteger num01 = new BigInteger(num1);
        BigInteger num02 = new BigInteger(num2);
        return ""+ num01.multiply(num02);
    }
}
