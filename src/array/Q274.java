package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/2 17:26
 * @Description:
 **/
public class Q274 {
    public int hIndex(int[] citations) {
        int[] temp = new int[citations.length+1];
        for (int citation : citations) {
            if(citation > citations.length){
                temp[citations.length] += 1;
            }else{
                temp[citation] += 1;
            }
        }
        // 反向家和
        int sum = 0;
        for (int i = temp.length; i > 0 ; i--) {
            int val = temp[i];
            temp[i] += sum;
            sum += val;
        }
        for(int i = temp.length; i > 0;i --){
            if(temp[i] == i){
                return i;
            }
        }
        return 0;

    }
}
