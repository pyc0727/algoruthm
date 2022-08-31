package tree;

import apple.laf.JRSUIUtils;
import array.Q68;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/22 10:47
 * @Description:
 **/
public class Q655 {
    int h,m,n;
    public List<List<String>> printTree(TreeNode root) {
        dfs1(root,0);
        List<List<String>> ans = new ArrayList<>();
        m = h+1;n = (1<<(h+1))-1;
        for (int i = 0; i < m; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add("");
            }
            ans.add(list);
        }
        dfs2(root,0,(n-1)/2,ans);
        return ans;
    }

    public void dfs1(TreeNode node, int depth){
        if(node == null) return;
        h = Math.max(h,depth);
        dfs1(node.left, depth+1);
        dfs1(node.right,depth+1);
    }

    public void dfs2(TreeNode node,int r, int c,List<List<String>> list ){
        if(node == null)return;
        list.get(r).set(c,String.valueOf(node.val));
        dfs2(node.left,r+1,c-(1<<(h-r-1)),list);
        dfs2(node.right,r+1,c+(1<<(h-r-1)),list);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        node.left = node1;
        new Q655().printTree(node);
    }


}
