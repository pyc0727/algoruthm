package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/5 16:24
 * @Description:
 **/
public class Q476 {
    public int findComplement(int num) {
        long i = 1;
        while(i <= num){
            i <<= 1;
        }
        return (int) (i-1)^num;
    }
}
