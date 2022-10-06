package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/10/1 06:26
 * @Description:
 **/
public class Q1684 {
    public String reformatNumber(String number) {
        int count = 3;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if(Character.isDigit(number.charAt(i))){
                sb.append(number.charAt(i));
                count--;
                if(count == 0){
                    sb.append("-");
                    count = 3;
                }
            }
        }
        int s = sb.length() - 1;
        int n = 0;
        while(s >= 0 && sb.charAt(s) != '-'){
            s--;
            n++;
        }
        if(n == 0){
            return sb.substring(0,sb.length()-1);
        }else if( n == 1){
            return sb.substring(0,sb.length()-3)+'-'+sb.charAt(sb.length()-3)+sb.charAt(sb.length()-1);
        }else{
            return sb.toString();
        }

    }
}
