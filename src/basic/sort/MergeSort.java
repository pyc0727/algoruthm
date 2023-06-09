package basic.sort;

import java.util.Arrays;

/**
 * @Auther: buyunchuan
 * @Date: 2022/11/23 22:42
 * @Description:
 **/
public class MergeSort {

    public static void mergeSort(int[] arr, int n){
        if(n < 1) return;
        int[] temp = new int[n];
        sort(arr,0,n-1,temp);
    }
    public static void sort(int[] arr,int s,int e,int[] temp){
        if(s >= e)return;
        int m = (s+e)/2;
        sort(arr,s,m,temp);
        sort(arr,m+1,e,temp);
        merge(arr,s,e,temp);
    }

    private static void merge(int[] arr, int s, int e, int[] temp) {
        int m = (s+e)/2;
        int l = s;
        int r = m+1;
        int i = l;
        while(l <= m && r <= e){
            if(arr[l] <= arr[r]){
                temp[i++] = arr[l];
                l++;
            }else{
                temp[i++] = arr[r];
                r++;
            }
        }
        if(l > m){
            while(r <= e){
                temp[i++] = arr[r++];
            }
        }else{
            while(l <= m){
                temp[i++] = arr[l++];
            }
        }
        while(s <= e){
            arr[s] = temp[s];
            s++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,33,53,64,4,3,1,2};
        mergeSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
