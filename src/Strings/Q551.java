package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/29 14:53
 * @Description:
 **/
public class Q551 {
    public boolean checkRecord(String s) {
        int ll = -1;
        int lr = -1;
        int Acount = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A'){
                Acount ++;
                if (Acount >= 2)return false;
                lr = i;
                ll = i;
            }if(s.charAt(i) == 'L'){
                lr++;
                if(lr - ll >= 3)return false;
            }else {
                lr = i;
                ll = i;
            }
        }
        return true;
    }
}
