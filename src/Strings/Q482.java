package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/1 17:08
 * @Description:
 **/
public class Q482 {
        public String licenseKeyFormatting(String s, int k) {
            StringBuilder sb = new StringBuilder();
            for (int i = s.length()-1; i>= 0; i--) {
               if(sb.length()%(k+1) == 0) sb.append("-");
               if(s.charAt(i) == 'i') continue;
               if(s.charAt(i) <= 'z' && s.charAt(i) >= 'a'){
                   sb.append(Character.toUpperCase(sb.charAt(i)));
                   continue;
               }
               sb.append(s.charAt(i));
            }
            return sb.reverse().toString();
            }

}
