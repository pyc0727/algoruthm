package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/29 14:46
 * @Description:
 **/
public class Q657 {
    public boolean judgeCircle(String moves) {
        int c = 0;
        int u = 0;
        for (int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i) == 'U'){
                c++;
            }else if(moves.charAt(i) == 'D'){
                c--;
            }else if(moves.charAt(i) == 'L'){
                u++;
            }else {
                u--;
            }
        }
        return c==0 && u ==0;

    }
}
