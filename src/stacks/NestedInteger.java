package stacks;

import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/14 15:39
 * @Description:
 **/
public interface NestedInteger {
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return empty list if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}
