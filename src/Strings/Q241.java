package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/26 14:10
 * @Description:
 **/
public class Q241 {
    public String reverseStr(String s, int k) {
        char[] charArr = s.toCharArray();
        int num = charArr.length/k;
        for (int i = 0; i < num; i=i+2) {
            int left = i*k;
            int right = (i+1)*k -1;
            while(left <= right){
                char temp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = temp;
                left++;
                right--;
            }
        }
        if(num % 2 == 0) {
            int left = k * num;
            int right = s.length() - 1;
            while (left <= right) {
                char temp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(charArr);
    }

    public static void main(String[] args) {
        new Q241().reverseStr("abcdefg",4);
    }
}
