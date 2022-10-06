package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/1 17:36
 * @Description:
 **/
public class Q6 {
    public static String convert(String s, int numRows) {
        if(numRows == 1)return s;
        int loopCount = (numRows - 2)<=0?1:numRows-2;
        int col = ((s.length()/loopCount)+1)*(numRows-1)+3;
        int[][] temp = new int[numRows][col];
        int num = 0;
        int col_ = 0;
        while(num<s.length() &&  col_< col){
            if(col_%(numRows-1) == 0){
                for (int i = 0; i < numRows && num<s.length(); i++) {
                    temp[i][col_] = s.charAt(num++);
                }
                col_++;
            }
            //继续填充后续数字
            for (int i = numRows - 2; i > 0  && num<s.length() ; i--) {
                temp[i][col_] = s.charAt(num++);
                col_++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                if(temp[i][j] != 0 ){
                    sb.append(((char) temp[i][j]));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        convert("A",1);
    }
}
