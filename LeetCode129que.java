import java.util.LinkedList;
import java.util.List;

public class LeetCode129que {
//    给你一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
//    每条从根节点到叶节点的路径都代表一个数字：
//
//    例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
//    计算从根节点到叶节点生成的 所有数字之和 。
//
//    叶节点 是指没有子节点的节点。
//    输入：root = [1,2,3]
//    输出：25
//    解释：
//    从根到叶子节点路径 1->2 代表数字 12
//    从根到叶子节点路径 1->3 代表数字 13
//    因此，数字总和 = 12 + 13 = 25
//
    static  int  sum;
    public void bianliyezi(TreeNode node,int li_k){
        if(node==null)return;

        li_k = li_k*10+ node.val;
        if (node.right==null &&node.right==null){

            sum += li_k;
        }
        bianliyezi(node.right,li_k);
        bianliyezi(node.left,li_k);


    }
    public int sumNumbers(TreeNode root) {
        sum=0;
        bianliyezi(root,0);
        return  sum;
    }

}
