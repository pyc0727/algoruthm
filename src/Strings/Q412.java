package Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/30 15:23
 * @Description:
 **/
public class Q412 {
    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>(n);
        for (int i = 1; i < n+1; i++) {
            if(n % 3 == 0){
                if(n % 5 == 0){
                    ans.add("FizzBuzz");
                }
                else{
                    ans.add("Fizz");
                }
            }else if(n % 5 == 0){
                ans.add("Buzz");
            }else {
                ans.add(String.valueOf(i));
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        fizzBuzz(3);
    }
}
