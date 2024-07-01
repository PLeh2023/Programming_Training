public class A1342_Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args) {

        int input = 8;
        int steps = 0;
        while(input != 0){
            if (input % 2 == 0){
                input /=2;
            }else{
                input--;
            }
            steps++;
        }
        System.out.println(steps);
    }
}
