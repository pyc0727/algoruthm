package tree;

import org.omg.CORBA.MARSHAL;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/2 10:55
 * @Description:
 **/
public class Q687 {
    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        int res = dfs(root);
        return Math.max(max,res);
    }

    private int dfs(TreeNode root){
        if(root == null) return 0;
        int cur = 1,ans = 1,l = dfs(root.left),r = dfs(root.right);
        if(root.left != null && root.left.val == root.val){
            cur += l;ans += l;
        }
        if(root.right != null && root.right.val == root.val){
            cur+=r;ans = Math.max(ans,ans - l + r);
        }
        max = Math.max(cur,max);
        return ans;
    }
}
