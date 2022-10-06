package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/5 15:45
 * @Description:
 **/
public class Q263 {
    public boolean isUgly(int n) {
        while(n != 1){
            if(n%2 == 0 ){
                n = n/2;
                continue;
            }
            if(n%3 == 0 ){
                n = n/3;
                continue;
            }
            if(n%5 == 0 ){
                n = n/5;
                continue;
            }
            return false;
        }
        return true;
    }
}
