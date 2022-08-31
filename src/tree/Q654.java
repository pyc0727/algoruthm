package tree;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/20 11:46
 * @Description:
 **/



public class Q654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums,0,nums.length-1);
    }

    private TreeNode build(int[] nums,int l,int r){
        if(r<l)return null;
        int i = l;
        for (int j = l; j <= r; j++) {
            if(nums[i] < nums[j]) i =j;
        }
        TreeNode treeNode = new TreeNode(nums[i]);
        treeNode.left = build(nums,l,i-1);
        treeNode.right = build(nums,i+1,r);
        return treeNode;
    }


}
