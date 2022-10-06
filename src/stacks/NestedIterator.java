package stacks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/14 15:38
 * @Description:
 **/


  // This is the interface that allows for creating nested lists.
  // You should not implement it, or speculate about its implementation
public class NestedIterator implements Iterator<Integer> {

    private int temp;

    private final int size;

    private final List<Integer> intList = new ArrayList<>();
    
    public NestedIterator(List<NestedInteger> nestedList) {
        loopNestedList(nestedList);
        this.size = intList.size();
        temp = 0;
    }
    
    private void loopNestedList(List<NestedInteger> list){
        if(list == null || list.isEmpty())return;
        for (NestedInteger nestedInteger : list) {
            if (nestedInteger.isInteger()) intList.add(nestedInteger.getInteger());
            loopNestedList(nestedInteger.getList());
        }
    }

    @Override
    public Integer next() {
        return intList.get(temp++);

    }

    @Override
    public boolean hasNext() {
        return temp<size;
    }

}
