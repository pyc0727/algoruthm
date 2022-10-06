package num;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/5 14:04
 * @Description:
 **/
public class Q9 {
    public boolean isPalindrome(int x) {
        if (x<0)return false;
        try {
            return x == Integer.parseInt(new StringBuilder().append(x).reverse().toString());
        }catch (Exception e){}
        return false;


    }
}
