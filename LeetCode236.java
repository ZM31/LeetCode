public class LeetCode236 {
//    给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
//
//    百度百科中最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，最近公共祖先表示为一个节点 x，
//    满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
//
//      输入：root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
//      输出：3
//      解释：节点 5 和节点 1 的最近公共祖先是节点 3 。
    TreeNode tar_root = new TreeNode();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        boolean k =dfs(root,p,q);
        return tar_root;
}

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null){
            return false;
        }
        boolean k_left=false;
        boolean k_right=false;
        if (root.left!=null){ k_left = dfs(root.left,p,q);}
        if (root.right!=null){ k_right = dfs(root.right,p,q);}
        if ((k_left&&k_right)||((k_left||k_right)&&((root==q)||(root==p)))){
            tar_root=root;
        }
        if (k_left||k_right||root==p||root==q){
            return true;
        }
        return false;
    }

}
