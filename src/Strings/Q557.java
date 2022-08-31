package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/26 14:32
 * @Description:
 **/
public class Q557 {
    public String reverseWords(String s) {
        s = s+ " ";
        char[] charArr = s.toCharArray();
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if(charArr[i] == ' '){
                changeArr(charArr, l, i -1);
                l = i+1;
            }
        }
        return new String(charArr).substring(0, s.length() - 1);
    }

    private void changeArr(char[] arr, int l , int r){
        while(r > l){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;r--;
        }
    }

}
