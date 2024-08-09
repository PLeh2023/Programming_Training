public class A2678_Number_of_Senior_Citizens {
    public static void main(String[] args) {

    }
    public static int countSeniors(String[] details) {
        int counter = 0;
        for (int i = 0; i < details.length; i++){
            if (details[i].charAt(11) < 6){continue;}
            if (60 < Integer.parseInt(details[i].substring(11,13))){
                counter++;
            }
        }
        return counter;
    }
}
