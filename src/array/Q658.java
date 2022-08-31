package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/25 10:02
 * @Description:
 **/
public class Q658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int minIndex = -1;
        int minval = Integer.MAX_VALUE;
        int[] absArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            absArr[i] = Math.abs(arr[i] - x);
            if(minval > absArr[i]){
                minval = absArr[i];
                minIndex = i;
            }
        }
        int left = minIndex - 1,right = minIndex +1;
        List<Integer> list = new ArrayList<>(k);
        list.add(arr[minIndex]);
        for (int i = 0; i < k; i++) {
            if(left >= 0 && right < arr.length){
                if(absArr[left] < absArr[right]){
                    list.add(arr[left]);
                    left--;
                }else{
                    list.add(arr[right]);
                    right++;
                }
            }else if(left < 0){
                list.add(arr[right]);
                right++;
            }else{
                list.add(arr[left]);
                left++;
            }

        }
        list.sort(Integer::compareTo);
        return list;
    }

    public static void main(String[] args) {
        new Q658().findClosestElements(new int[]{1,1,1,10,10,10},1,9);
    }

}
