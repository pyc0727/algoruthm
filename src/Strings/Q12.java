package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/31 15:10
 * @Description:
 **/
public class Q12 {
    int[] digits = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] letters = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            while(num >= digits[i]){
                sb.append(letters[i]);
                num -= digits[i];
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Integer.valueOf("00022"));
    }
}
