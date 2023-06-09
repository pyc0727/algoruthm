package source;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Auther: buyunchuan
 * @Date: 2022/11/25 19:05
 * @Description:
 **/
public class Main {
    public static void main(String[] args) {
        ServiceLoader<SpiTest> spiTests = ServiceLoader.load(SpiTest.class);
        Iterator<SpiTest> spiTestIterator = spiTests.iterator();
        while (spiTestIterator.hasNext()){
            SpiTest test = spiTestIterator.next();
            test.test();
        }
    }
}
