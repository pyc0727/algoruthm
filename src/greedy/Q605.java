package greedy;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/30 19:53
 * @Description:
 **/
public class Q605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i = 0;
        while(i < flowerbed.length){
            if(flowerbed[0] == 0){
                if(i == flowerbed.length-1 || flowerbed[i+1] == 0){
                    count++;
                    i+=2;
                }else{
                    i+=3;
                }
            }else{
                i+=2;
            }
        }
        return count>= n;
    }
}
