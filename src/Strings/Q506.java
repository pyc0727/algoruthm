package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/30 15:39
 * @Description:
 **/
public class Q506 {
    public String[] findRelativeRanks(int[] score) {
        int[] newArray = Arrays.copyOf(score,score.length);
        Arrays.sort(newArray);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < newArray.length; i++) {
            map.put( newArray[i],i);
        }
        String[] strings = new String[score.length];
        for (int i = 0; i < strings.length; i++) {
            int no = strings.length-map.get(score[i]);
            if(no == 1){
                strings[i] = "Gold Medal";
            }else if(no == 2){
                strings[i] = "Silver Medal";
            } else if (no == 3){
                strings[i] = "Bronze Medal";
            }else {
                strings[i] = String.valueOf(no);
            }
        }
        return strings;

    }
}
