package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/5 10:52
 * @Description:
 **/
public class Q652 {

    private Map<String,Integer> map = new HashMap<>();
    private List<TreeNode> treeNodes = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return treeNodes;
    }

    private String dfs(TreeNode treeNode){
        if(treeNode == null)return " ";
        StringBuilder sb = new StringBuilder();
        sb.append(treeNode.val).append("_");
        sb.append(dfs(treeNode.left)).append("_").append(treeNode.right);
        map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
        if(map.get(sb.toString()) == 2) treeNodes.add(treeNode);
        return sb.toString();
    }
}
