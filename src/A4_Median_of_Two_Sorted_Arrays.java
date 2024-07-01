public class A4_Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] num1 = {0,0};
        int[] num2 = {0,0};
        System.out.println(findMedianSortedArrays(num1, num2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] allNum = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(!(allNum.length == k)){
            if (!(i == nums1.length)) {
                if (j == nums2.length || nums1[i] <= nums2[j]) {
                    allNum[k] = nums1[i];
                    i++;
                } else {
                    allNum[k] = nums2[j];
                    j++;
                }
            }else {
                allNum[k] = nums2[j];
                j++;
            }
               k++;
        }
        int pos = allNum.length / 2;

        if (allNum.length % 2 == 1){return allNum[pos];}
        else{return (double)(allNum[pos] + allNum[pos - 1]) / 2;}
    }
}
