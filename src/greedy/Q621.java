package greedy;

/**
 * @Auther: buyunchuan
 * @Date: 2022/10/1 06:49
 * @Description:
 **/
public class Q621 {
    public int leastInterval(char[] tasks, int n) {
        if(n == 0)return tasks.length;
        int[] res = new int[26];
        for (char task : tasks) {
            res[task-'A']++;
        }
        int max = 0;
        int count = 0;
        for (int re : res) {
            max = Math.max(re,max);
        }
        for (int re : res) {
            if(re == max)count++;
        }

        return Math.max(tasks.length,(max-1)*(n+1)+count);
    }
}
