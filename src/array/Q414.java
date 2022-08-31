package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/1 14:55
 * @Description:
 * 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[3, 2, 1]
 * 输出：1
 * 解释：第三大的数是 1 。
 * 示例 2：
 *
 * 输入：[1, 2]
 * 输出：2
 * 解释：第三大的数不存在, 所以返回最大的数 2 。
 * 示例 3：
 *
 * 输入：[2, 2, 3, 1]
 * 输出：1
 * 解释：注意，要求返回第三大的数，是指在所有不同数字中排第三大的数。
 * 此例中存在两个值为 2 的数，它们都排第二。在所有不同数字中排第三大的数为 1 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/third-maximum-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Q414 {

    public int thirdMax(int[] nums) {
        long a = Long.MIN_VALUE,b = Long.MIN_VALUE,c =  Long.MIN_VALUE;
        for (int num : nums) {
            if(num > a && num > b && num > c){
                c = b;
                b = a;
                a = num;
            }else if(num < a && num > b && num > c){
                c = b;
                b = num;
            }else if(num < a && num < b && num > c){
                c = num;
            }
        }
        return c == Long.MIN_VALUE?(int) a :(int) c;
    }


}
