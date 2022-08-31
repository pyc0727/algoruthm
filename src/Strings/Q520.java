package Strings;

import array.Q658;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/25 17:43
 * @Description:
 **/
public class Q520 {
    public boolean detectCapitalUse(String word) {
        boolean flag = true;
        for (int i = 0; i < word.length(); i++) {
            if(i == 0){
                if(word.charAt(i) >= 'A') flag = false;
                continue;
            }
            if(i == 1){
                if(flag){
                    if(word.charAt(i) >= 'A') flag = false;
                }else{
                    if(word.charAt(i) <= 'z' ) return false;
                }
                continue;
            }
            if(flag){
                if(word.charAt(i) >= 'A') return false;
            }else {
                if(word.charAt(i) <= 'z') return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        new Q520().detectCapitalUse("USA");
    }
}
