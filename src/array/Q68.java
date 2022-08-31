package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/10 20:51
 * @Description:
 **/
public class Q68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list = new ArrayList<>(words.length);
        StringBuilder sb = new StringBuilder();
        int len;
        for (int i = 0; i < words.length;) {
            sb.setLength(0);
            len = words[i].length();
            int j = i+1;
            while(j < words.length && len + words[j].length()+1 <= maxWidth ){
                len += (words[j].length()+1);
                j++;
            }
            if(j == 1+i){
                sb.append(words[i]);
                while(sb.length()<maxWidth){
                    sb.append(" ");
                }
            }else{
                int blankCount = (maxWidth - len)/(j-1-i) + 1;
                int surplusCount = (maxWidth-len)%(j-1-i);
                for (int start = i; start <j;start++){
                    sb.append(words[start]);
                    if(start != j-1){
                        for (int s = 0;s < blankCount ;s++) sb.append(" ");
                    }
                    if(surplusCount>0) {
                        sb.append(" ");
                        surplusCount--;
                    }
                }
            }
            list.add(sb.toString());
            i = j;
        }
        String lastString = list.get(list.size()-1);
        int start = 1,end = lastString.length()-1;
        while(start < end){
            if(sb.charAt(start) == ' ' && sb.charAt(start-1) == ' '){
                sb.deleteCharAt(start);
                sb.append(" ");
                end--;
            }else{
                start++;
            }
        }
        String newLastString = sb.toString();
        list.remove(list.size() - 1);
        list.add(newLastString);
        return list;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"What","must","be","acknowledgment","shall","be"};
        new Q68().fullJustify(words,16);
    }
}
