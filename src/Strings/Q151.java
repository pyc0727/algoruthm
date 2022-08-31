package Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/26 16:46
 * @Description:
 **/
public class Q151 {
    public String reverseWords(String s) {
        s = s+ " ";
        List<String> list = new ArrayList<>();
        int l = 0,r = l;
        while (r != s.length()-1){
            while(l < s.length() && s.charAt(l) == ' '){
                l++;
            }
            r = l;
            while(r < s.length() && s.charAt(r) != ' '){
                r++;
            }
            if(l == r)break;;
            list.add(s.substring(l,r));
            l = r;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = (list.size() - 1); i >= 0; i++) {
            sb.append(list.get(i)).append(" ");
        }
        return sb.substring(0,sb.length()-1);
    }

    public static void main(String[] args) {
        System.out.println("111".substring(1,1));
    }
}
