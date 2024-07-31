import java.util.ArrayList;
import java.util.Arrays;

public class A1636_Sort_Array_byIncreasing_Frequency {
    public static void main(String[] args) {
        int[] nums = {-8,7,-1,3,5,7,-8,-8,0};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }
    public static int[] frequencySort(int[] nums) {
        ArrayList<Integer> storage = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if(!storage.contains(nums[i])){
                storage.add(nums[i]);
            }
        }
        int[][] counter = new int[storage.size()][2];
        for (int l = 0; l < storage.size(); l++){
            counter[l][0] = storage.get(l);
        }
        for (int k = 0; k < nums.length; k++){
            for (int m = 0; m < counter.length; m++){
                if (nums[k] == counter[m][0]){
                    counter[m][1] += 1;
                }
            }
        }
        bubblesort(counter);
        bubblesortLight(counter);
        int counterFull = 0;
        for (int a = 0; a < counter.length; a++){
            for (int b = 0; b < counter[a][1]; b++){
                nums[counterFull] = counter[a][0];
                counterFull++;
            }
        }
        return nums;
    }
    public static void bubblesort(int counter[][]){
        for(int i = 0; i < counter.length - 1; i++){
            for(int j = 0; j < counter.length -i -1; j++){
                if(counter[j][1] > counter[j+1][1]){
                    int tmp = counter[j][0];
                    int tmpC = counter[j][1];
                    counter[j][1] = counter[j + 1][1];
                    counter[j][0] = counter[j + 1][0];
                    counter[j + 1][0] = tmp;
                    counter[j + 1][1] = tmpC;
                }
            }
        }
    }
    public static void bubblesortLight(int counter[][]) {
        for (int i = 0; i < counter.length - 1; i++) {
            for (int z = 0; z < counter.length - i - 1; z++) {
                if (counter[z][1] == counter[z + 1][1] && counter[z][0] < counter[z + 1][0]) {
                    int tmp = counter[z][0];
                    int tmpC = counter[z][1];
                    counter[z][1] = counter[z + 1][1];
                    counter[z][0] = counter[z + 1][0];
                    counter[z + 1][0] = tmp;
                    counter[z + 1][1] = tmpC;
                }
            }
        }
    }
}
