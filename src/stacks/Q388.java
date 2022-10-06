package stacks;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/9 11:16
 * @Description:
 **/
public class Q388 {
    public static int lengthLongestPath(String input) {
        String[] strings = input.split("\n");
        int ans = 0;
        List<String> stringList = new ArrayList<>();
        for (String string : strings) {
            int i = 0;
            while(string.charAt(i)=='\t'){
                i++;
            }
            String name = string.substring(i);
            stringList.add(i,name);
            if(name.contains(".")){
                int length = 0;
                for (int j = 0; j <= i; j++) {
                    length += stringList.get(j).length();
                }
                ans = Math.max(length+i,ans);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext");
    }
}
