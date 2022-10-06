package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/7 10:54
 * @Description:
 **/
public class Q168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber != 0){
            sb.append((char) ((columnNumber%26) +'A'));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
