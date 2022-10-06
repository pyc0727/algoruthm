package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/8 13:42
 * @Description:
 **/
public class Q400 {
    public static int findNthDigit(int n) {
        if(n < 10)return  n;
        long l = 9;
        long r;
        int lnum = 0;
        int num= 0;
        int count = 0;
        for (int i = 1 ; i < 10; i++) {
            lnum += 9 * (int)Math.pow(10,i-1) ;
            r = (long)9 * (int)Math.pow(10,i) * (i+1) + l;
            if(l < n && n <= r){
                count = (int)(n -l)%(i+1);
                num = lnum + (int)(n - l)/(i+1);
                if(count == 0)return (num)%10;
                return (num+1)/((int)Math.pow(10,i+1-count))%10;
            }
            l = r;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(1000000000));
    }


}
