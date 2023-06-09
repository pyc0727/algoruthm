package basic.sort;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

/**
 * @Auther: buyunchuan
 * @Date: 2022/11/24 11:33
 * @Description:
 **/
public class QuickSort {

    public static int quick_sort(int[] arr,int p,int r) throws InterruptedException, BrokenBarrierException {
        Semaphore semaphore = new Semaphore(2);
        semaphore.acquire();
        CountDownLatch countDownLatch = new CountDownLatch(5);
        countDownLatch.countDown();
        countDownLatch.await();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(20);
        cyclicBarrier.await();

        return 1;

    }
}
