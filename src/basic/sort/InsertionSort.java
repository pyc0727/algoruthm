package basic.sort;

import javax.naming.PartialResultException;
import java.util.Arrays;

/**
 * @Auther: buyunchuan
 * @Date: 2022/11/23 22:15
 * @Description:
 **/
public class InsertionSort {
    
    public static void insertSort(int[] arr,int n){
        if(n <=1)return;
        for (int i = 1; i < n; i++) {
            int val = arr[i];
            int j = i -1;
            for (; j >= 0 ; j--) {
                if(arr[j] > val){
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = val;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,1,2};
        insertSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
