public class LeetCode230 {
//    给定一个二叉搜索树的根节点 root ，和一个整数 k ，
//    请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。
//    输入：root = [3,1,4,null,2], k = 1
//    输出：1

//    输入：root = [5,3,6,2,4,null,null,1], k = 3
//    输出：3
    static int target;
    int i =0;
    private void dfs(TreeNode root,int k) {
        if (root.left!=null){dfs(root.left,k);}
        i=i+1;
        if (i==k)target=root.val;
        if (root.right!=null)dfs(root.right,k);

    }
    public int kthSmallest(TreeNode root, int k) {

        dfs(root,k);
        return target;
    }
}


