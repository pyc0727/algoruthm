package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/12/1 11:23
 * @Description:
 **/
public class Q5 {
    public static String longestPalindrome(String s) {
        if(s.length() < 1)
            return s;
        int start = 0,end = 0,n = s.length(),max = 1;
        boolean[][] isPalindromic = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            isPalindromic[i][i] = true;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(s.charAt(i) != s.charAt(j)){
                    continue;
                }else{
                    if(i - j < 3)
                        isPalindromic[j][i] = true;
                    else {
                        isPalindromic[j][i] = isPalindromic[j+1][i- 1];
                    }
                    if(isPalindromic[j][i] && (i - j +1)>max){
                        max = i - j + 1;
                        start = j;
                        end = i+1;
                    }
                }
            }
        }
        return s.substring(start,end);

    }

    public static void main(String[] args) {
        longestPalindrome("aaaa");
    }
}
