package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: buyunchuan
 * @Date: 2022/12/6 12:15
 * @Description:
 **/
public class Q1805 {
    public static int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            if(Character.isLetter(word.charAt(i))){
                continue;
            }else{
                StringBuilder sb = new StringBuilder();
                while(i < word.length() && Character.isDigit(word.charAt(i))){
                    if('0' == word.charAt(i) && sb.length() == 0) continue;
                    sb.append(word.charAt(i));
                    i++;
                }
                set.add(sb.toString());
            }
        }
        return set.size();

    }

    public static void main(String[] args) {
        numDifferentIntegers("a123bc34d8ef34");
    }
}
