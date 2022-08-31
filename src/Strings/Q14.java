package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/25 13:48
 * @Description:
 **/
public class Q14 {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while(!strs[i].startsWith(prefix)){
                if(strs.length == 1){
                    return "";
                }
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }


}
