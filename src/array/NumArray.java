package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/9 20:31
 * @Description:
 **/
public class NumArray {
        int[] data;
        int size;
        public NumArray(int[] nums) {
                nums = this.data;
                size = data.length;
        }

        public void update(int index, int val){
                if(index >= size){
                        throw new IllegalArgumentException();
                }
                data[index] =val;
        }

        public int sumRange(int left, int right) {
                int sum = 0;
                for (int i = left; i <= right; i++) {
                        sum += data[i];
                }
                return sum;
        }
}
