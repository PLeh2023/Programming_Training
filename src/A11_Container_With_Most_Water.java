public class A11_Container_With_Most_Water {
    public static void main(String[] args) {
    int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int area = 0;
        while (true){
            int tmp;
            if (height[start] > height[end]){
                tmp = height[end] * (end - start);
                end--;
            }else{
                tmp = height[start] * (end - start);
                start++;
            }
            if (area < tmp){area = tmp;}
            if (start >= end){break;}
        }
        return area;
    }
    /*public static int maxArea(int[] height) {
        int area = 0;
        if (height.length == 2){
            if (height[0] > height[1]){
                return height[1];
            }else{
                return height[0];
            }
        }
        for (int i = 0; i < height.length; i++){
            for (int j = height.length - 1; j > 0; j--){
                int tmp = 0;
                if (height[i] > height[j]){
                    tmp = height[j] * (j - i);
                }else{
                    tmp = height[i] * (j - i);
                }
                if (area < tmp){area = tmp;}
            }
            if (i > height.length/2){
                break;
            }
        }
        return area;
    }*/
}
