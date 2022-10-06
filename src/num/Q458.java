package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/6 15:53
 * @Description:
 **/
public class Q458 {
    public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        return (int) Math.ceil(Math.log(buckets)/Math.log(minutesToTest/minutesToDie + 1)- 1e-5);
    }

    public static void main(String[] args) {
        poorPigs(125,1,4);
    }
}
