package Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/7 10:13
 * @Description:
 **/
public class Q1592 {
    public String reorderSpaces(String text) {
        int blankCount = 0;
        List<String> words = new ArrayList<>();
        text = text + " ";
        int l;
        for (int i = 0; i < text.length();) {
            if(text.charAt(i) == ' '){
                blankCount++;
                i++;
            }else {
                l = i;
                while(text.charAt(i) != ' '){
                    i++;
                }
                words.add(text.substring(l,i));
            }
        }
        if(words.size() == 1){
            StringBuilder sb = new StringBuilder();
            sb.append(words.get(0));
            for (int i = 0; i < blankCount; i++) {
                sb.append(" ");

            }
            return sb.toString();
        }
        int blanks = (blankCount - 1)/(words.size() - 1);
        int last = (blankCount - 1)%(words.size() - 1);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.size() - 1; i++) {
            stringBuilder.append(words.get(i));
            for (int j = 0; j < blanks; j++) {
                stringBuilder.append(' ');
            }
        }
        stringBuilder.append(words.get(words.size()-1));
        for (int i = 0; i < last; i++) {
            stringBuilder.append(" ");

        }
        return stringBuilder.toString();


    }
}
