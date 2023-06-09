package basic.sort;

import java.util.Arrays;

/**
 * @Auther: buyunchuan
 * @Date: 2022/11/23 21:40
 * @Description:
 **/
public class BubbleSort {
    public static void bubbleSort(int[] array){
        if(array.length == 0 || array.length==1)
            return;
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1;j < n;j++){
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,1,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
