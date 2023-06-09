package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/10/6 13:53
 * @Description:
 **/
public class Q1784 {
    public boolean checkOnesSegment(String s) {
        int count = 0 ;
        for (int i = 0; i < s.length(); i++) {
         if(s.charAt(i) == '1'){
                 while(i < s.length() && s.charAt(i) == '1')i++;
                 count++;
         }
        }
        return count<=1;
    }

}
