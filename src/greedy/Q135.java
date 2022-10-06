package greedy;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/30 22:19
 * @Description:
 **/
public class Q135 {
    public int candy(int[] ratings) {
        int[] l = new int[ratings.length];
        int[] r = new int[ratings.length];
        for (int i = 1; i < ratings.length; i++) {
            if(ratings[i] > ratings[i-1]){
                l[i] = l[i-1]+1;
            }
        }
        int count = ratings.length;
        for (int i = ratings.length-2; i >= 0 ; i--) {
            if(ratings[i] > ratings[i+1]){
                r[i] = r[i+1]+1;
            }
           count+=(Math.max(r[i],l[i]));
        }
        count+=l[ratings.length-1];
        return count;
    }
}
