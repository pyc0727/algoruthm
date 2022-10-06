package greedy;

import java.sql.Array;
import java.util.Arrays;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/30 21:52
 * @Description:
 **/
public class Q455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0,j = 0;
        int count = 0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                i++;
            }
            j++;
        }
        return count;
    }
}
