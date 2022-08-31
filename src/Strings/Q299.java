package Strings;

import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/30 15:15
 * @Description:
 **/
public class Q299 {
    public String getHint(String secret, String guess) {
        int[] secretCount = new int[10];
        int[] guessCount = new int[10];
        int a = 0;
        for (int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)){
                a++;
                continue;
            }
            secretCount[secret.charAt(i)-'0']++;
            guessCount[guess.charAt(i)-'0']++;
        }
        int b = 0;
        for (int i = 0; i < 10; i++) {
            b += Math.min(secretCount[i],guessCount[i] );
        }
        return a + "A" + b +"B";

    }

    public static void main(String[] args) {
        System.out.println('1'+'1');
    }
}
