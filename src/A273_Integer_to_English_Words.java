import java.util.Objects;

public class A273_Integer_to_English_Words {
    public static void main(String[] args) {
       int num = 1000;
        System.out.println(numberToWords(num));
    }
    public static String numberToWords(int num) {
        String number = STR."\{num}";
        String str = "";
        int counter = 0;

        for (int i = number.length(); i > 0; i = i-3){
            try {
                str = numberToWord(number.substring(i - 3, i), counter,str) + str;
            }catch (Exception e){
                try{
                    str = numberToWord(number.substring(i - 2, i), counter,str) + str;
                }catch (Exception f){
                    try {
                        str = numberToWord(number.substring(i - 1, i), counter,str) + str;
                    }catch (Exception _){}
                }
            }
            counter++;
        }
        return str;
    }
    public static String numberToWord(String number,int counter,String str){
        String[] tripel = { " Hundred"," Thousand"," Million"," Billion"," Trillion"," Quadrillion"," Quintillion",
                            " Sextillion"," Septillion"," Octillion"," Nonillion"," Decillion"};
        String output = "";
        int hasNumberTwo = 0;
        if (Objects.equals(number,"000")){return "";}
        if (number.length() == 3){
            switch (Integer.parseInt(STR."\{number.charAt(0)}")){
                case 1 : output += STR."One\{tripel[0]}";break;
                case 2 : output += STR."Two\{tripel[0]}";break;
                case 3 : output += STR."Three\{tripel[0]}";break;
                case 4 : output += STR."Four\{tripel[0]}";break;
                case 5 : output += STR."Five\{tripel[0]}";break;
                case 6 : output += STR."Six\{tripel[0]}";break;
                case 7 : output += STR."Seven\{tripel[0]}";break;
                case 8 : output += STR."Eight\{tripel[0]}";break;
                case 9 : output += STR."Nine\{tripel[0]}";break;
                default:break;
            }
        }
        if (number.length() == 3 && number.charAt(1) == '1' || number.length() == 2 && number.charAt(0) == '1'){
            hasNumberTwo++;
            if (number.length() == 3){
                if (!Objects.equals(output,"")){
                    switch (Integer.parseInt(STR."\{number.charAt(1)}\{number.charAt(2)}")){
                        case 10 : output += " Ten";break;
                        case 11 : output += " Eleven";break;
                        case 12 : output += " Twelve";break;
                        case 13 : output += " Thirteen";break;
                        case 14 : output += " Fourteen";break;
                        case 15 : output += " Fifteen";break;
                        case 16 : output += " Sixteen";break;
                        case 17 : output += " Seventeen";break;
                        case 18 : output += " Eighteen";break;
                        case 19 : output += " Nineteen";break;
                        default:break;
                    }
                }else{
                    switch (Integer.parseInt(STR."\{number.charAt(1)}\{number.charAt(2)}")){
                        case 10 : output += "Ten";break;
                        case 11 : output += "Eleven";break;
                        case 12 : output += "Twelve";break;
                        case 13 : output += "Thirteen";break;
                        case 14 : output += "Fourteen";break;
                        case 15 : output += "Fifteen";break;
                        case 16 : output += "Sixteen";break;
                        case 17 : output += "Seventeen";break;
                        case 18 : output += "Eighteen";break;
                        case 19 : output += "Nineteen";break;
                        default:break;
                    }
                }
            }else {
                switch (Integer.parseInt(STR."\{number.charAt(0)}\{number.charAt(1)}")) {
                    case 10: output += "Ten";break;
                    case 11: output += "Eleven";break;
                    case 12: output += "Twelve";break;
                    case 13: output += "Thirteen";break;
                    case 14: output += "Fourteen";break;
                    case 15: output += "Fifteen";break;
                    case 16: output += "Sixteen";break;
                    case 17: output += "Seventeen";break;
                    case 18: output += "Eighteen";break;
                    case 19: output += "Nineteen";break;
                    default: break;
                }
            }
        } else {
            if (number.length() == 3){
                if (!Objects.equals(output,"")){
                    switch (Integer.parseInt(STR."\{number.charAt(1)}")) {
                        case 2: output += " Twenty";break;
                        case 3: output += " Thirty";break;
                        case 4: output += " Forty";break;
                        case 5: output += " Fifty";break;
                        case 6: output += " Sixty";break;
                        case 7: output += " Seventy";break;
                        case 8: output += " Eighty";break;
                        case 9: output += " Ninety";break;
                        default:break;
                    }
                }else{
                    switch (Integer.parseInt(STR."\{number.charAt(1)}")) {
                        case 2: output += "Twenty";break;
                        case 3: output += "Thirty";break;
                        case 4: output += "Forty";break;
                        case 5: output += "Fifty";break;
                        case 6: output += "Sixty";break;
                        case 7: output += "Seventy";break;
                        case 8: output += "Eighty";break;
                        case 9: output += "Ninety";break;
                        default:break;
                    }
                }
            }else if (number.length() == 2){
                switch (Integer.parseInt(STR."\{number.charAt(0)}")) {
                    case 2: output += "Twenty";break;
                    case 3: output += "Thirty";break;
                    case 4: output += "Forty";break;
                    case 5: output += "Fifty";break;
                    case 6: output += "Sixty";break;
                    case 7: output += "Seventy";break;
                    case 8: output += "Eighty";break;
                    case 9: output += "Ninety";break;
                    default: break;
                }
            }
        }
        if (hasNumberTwo == 0){

            if (number.charAt(number.length()-1) == ' '){output = output.substring(0,number.length()-1);}
            //if (number.charAt(number.length()-1) == '0' && number.length() == 2){output = output.replace(" ","");}
            if (number.length() == 3) {
                if (!Objects.equals(output,"")){
                    switch (Integer.parseInt(STR."\{number.charAt(2)}")) {
                        case 1: output += " One";break;
                        case 2: output += " Two";break;
                        case 3: output += " Three";break;
                        case 4: output += " Four";break;
                        case 5: output += " Five";break;
                        case 6: output += " Six";break;
                        case 7: output += " Seven";break;
                        case 8: output += " Eight";break;
                        case 9: output += " Nine";break;
                        default: break;
                    }
                }else{
                    switch (Integer.parseInt(STR."\{number.charAt(2)}")) {
                        case 1: output += "One";break;
                        case 2: output += "Two";break;
                        case 3: output += "Three";break;
                        case 4: output += "Four";break;
                        case 5: output += "Five";break;
                        case 6: output += "Six";break;
                        case 7: output += "Seven";break;
                        case 8: output += "Eight";break;
                        case 9: output += "Nine";break;
                        default: break;
                    }
                }
            } else if (number.length() == 2) {
                switch (Integer.parseInt(STR."\{number.charAt(1)}")) {
                    case 1: output += " One";break;
                    case 2: output += " Two";break;
                    case 3: output += " Three";break;
                    case 4: output += " Four";break;
                    case 5: output += " Five";break;
                    case 6: output += " Six";break;
                    case 7: output += " Seven";break;
                    case 8: output += " Eight";break;
                    case 9: output += " Nine";break;
                    default: break;
                }
            }else{
                switch (Integer.parseInt(STR."\{number.charAt(0)}")) {
                    case 0: output += "Zero";break;
                    case 1: output += "One";break;
                    case 2: output += "Two";break;
                    case 3: output += "Three";break;
                    case 4: output += "Four";break;
                    case 5: output += "Five";break;
                    case 6: output += "Six";break;
                    case 7: output += "Seven";break;
                    case 8: output += "Eight";break;
                    case 9: output += "Nine";break;
                    default: break;
                }
            }
        }
        if (counter > 0 && Objects.equals(str,"")){return output + tripel[counter];}
        if (counter > 0){return output + tripel[counter] + " ";}
        return output;
    }
}
