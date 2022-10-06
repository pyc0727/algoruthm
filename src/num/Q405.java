package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/6 16:38
 * @Description:
 **/
public class Q405 {
    public String toHex(int num) {
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            int temp = num & 15;
            if(temp >= 10){
                sb.append((char) (temp-10+'a'));
            }else {
                sb.append((char) (temp+'0'));
            }
            num >>>= 4;
        }
        return sb.reverse().toString();
    }
}
