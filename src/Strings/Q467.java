package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/30 10:57
 * @Description:
 **/
public class Q467 {
    public int findSubstringInWraproundString(String p) {
        int[] letters = new int[26];
        p = " "+p;
        int a = 0;
        for (int i = 1 ; i < p.length(); i++) {
            if((p.charAt(i) - p.charAt(i-1)+26)%26 == 1){
                a++;
            }else{
                a = 1;
            }
            letters[p.charAt(i) - 'a'] = Math.max(letters[p.charAt(i) - 'a'],a);
        }
        int ans = 0;
        for (int i = 0; i < letters.length; i++) {
            ans += letters[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        new Q467().findSubstringInWraproundString("aca");
    }

}
