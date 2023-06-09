import com.sun.xml.internal.ws.util.CompletedFuture;
import sun.lwawt.macosx.CSystemTray;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: buyunchuan
 * @Date: 2022/11/2 10:50
 * @Description:
 **/
public class InitTest {

    static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(()-> 0);

    ReentrantLock lock = new ReentrantLock();


    static AtomicMarkableReference markableReference = new AtomicMarkableReference(100,false);

    public static void main(String[] args) {
        threadLocal.remove();
        new Thread(() -> {
            boolean marked = markableReference.isMarked();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            markableReference.compareAndSet(100,1000,marked,!marked);
            markableReference.compareAndSet(1000,100,!marked,marked);
            System.out.println(Thread.currentThread().getName()+"\t"+"值"+markableReference.getReference());
        },"t1").start();
        new Thread(() -> {
            boolean marked = markableReference.isMarked();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            markableReference.compareAndSet(100,2000,marked,!marked);
            System.out.println(Thread.currentThread().getName()+"\t"+"值"+markableReference.getReference());
        },"t2").start();
    }
    }

class son extends InitTest{
    {
        System.out.println("子类代码块");
    }

    static {
        System.out.println("子类静态代码块");
    }

    public son(){
        System.out.println("子构造方法");
    }
}
