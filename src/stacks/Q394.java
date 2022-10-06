package stacks;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/14 15:55
 * @Description:
 **/
public class Q394 {
    static int  l = 0;
    public static String decodeString(String s) {
        return decodeString(s,0);
    }

    public static String decodeString(String s,int index){
        StringBuilder sb1 = new StringBuilder();
        while(l < s.length()){
            if(Character.isDigit(s.charAt(l))){
                int count = 0;
                while(Character.isDigit(s.charAt(l))){
                    count = count*10 + s.charAt(l++) - '0';
                }
                //数字后必接左括号
                l++;
                String s1 = decodeString(s,l);
                for (int i = 0; i < count; i++) {
                    sb1.append(s1);
                }
            } else if (s.charAt(l) == ']') {
                l++;
                return sb1.toString();
            } else {
                sb1.append(s.charAt(l++));
            }
        }
        return sb1.toString();
    }

    public static void main(String[] args) {
        decodeString("3[a]2[bc]");
    }
}
