/**
 * @Auther: buyunchuan
 * @Date: 2022/6/30 14:21
 * @Description:
 **/

/**
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。

        '.' 匹配任意单个字符
        '*' 匹配零个或多个前面的那一个元素
        所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。

         
        示例 1：

        输入：s = "aa", p = "a"
        输出：false
        解释："a" 无法匹配 "aa" 整个字符串。
        示例 2:

        输入：s = "aa", p = "a*"
        输出：true
        解释：因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
        示例 3：

        输入：s = "ab", p = ".*"
        输出：true
        解释：".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
         

        提示：

        1 <= s.length <= 20
        1 <= p.length <= 30
        s 只包含从 a-z 的小写字母。
        p 只包含从 a-z 的小写字母，以及字符 . 和 *。
        保证每次出现字符 * 时，前面都匹配到有效的字符

     */
public class Q10 {

    
    public boolean isMatch(String s, String p) {
        char[] schar = s.toCharArray();
        char[] pchar = p.toCharArray();

        // 代表s的前i个字符能否被p的前j个字符匹配
        boolean[][] res = new boolean[s.length()+1][p.length()+1];

        // s和p长度都么0，为true
        res[0][0] = true;

        // s为空字符串，查看p是否符合
        for(int i =1; i <= pchar.length; i++){
            if(pchar[i-1] == '*'){
                res[0][i] = res[0][i-2];
            }
        }

        //开始循环
        for (int i = 1; i <= schar.length ; i++) {
            for(int j = 1; j <= pchar.length ; j ++){
                if(schar[i-1] == pchar[j-1] || pchar[i-1] == '.'){
                    res[i][j] = res[i-1][j-1];
                }else if(pchar[j-1] == '*'){
                    //前一个字符可以匹配时
                    if(schar[i-1] == pchar[i-2] || pchar[i-2] == '.'){
                        res[i][j] = res[i][j-2] //匹配0次时
                                || res[i-1][j]; //匹配一次或者多次时
                    }else{
                        res[i][j] = res[i][j-2];
                    }
                }
                //其余情况代表不匹配
            }
        }
        return res[s.length()][p.length()];
    }

    public static void main(String[] args) {
        new Q10().isMatch("aa","a*");
    }
}
