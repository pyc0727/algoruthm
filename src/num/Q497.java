package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/5 14:22
 * @Description:
 **/
public class Q497 {
    public static int largestPalindrome(int n) {
        if(n == 1)return 9;
        // 获取最大的数
        int max = (int)Math.pow(10,n) - 1;
        for (int i = max; i >= 0; i--) {
            //获取回文数
            long  palindrome = i;
            for (int j = i; j > 0 ; j=j/10) {
                palindrome = palindrome*10+j%10;
            }

            //查看是否可以整除
            for (long j = max; j*j >= palindrome; j--) {
                if(palindrome%j == 0)return ((int)palindrome%1337);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        largestPalindrome(5);

    }


}
