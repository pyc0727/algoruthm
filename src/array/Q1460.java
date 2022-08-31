package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/24 14:20
 * @Description:
 **/
public class Q1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        int res = 0;
        int[] temp = new int[1010];
        for(int i = 0; i < target.length;i ++){
            if (++temp[target[i]] == 1) res++;
            if(--temp[arr[i]] == 0) res--;
        }
        // 若最近结果相同，则res必为0，所有数字相等
        return res == 0;

    }
}
