import java.util.LinkedList;

public class LeetCode114 {
//    #给你二叉树的根结点 root ，请你将它展开为一个单链表：
//
//    展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
//    展开后的单链表应该与二叉树 先序遍历 顺序相同。
//    输入：root = [1,2,5,3,4,null,6]
//    输出：[1,null,2,null,3,null,4,null,5,null,6]
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
LinkedList<Integer> list = new LinkedList<>();
    public  void proinder(TreeNode node){
        if (node!=null){
            list.add(node.val);
            proinder(node.left);
            proinder(node.right);
        }
    }

    public void flatten(TreeNode root) {
        proinder(root);
        if(root ==null){
            return;
        }
        root.left = null;
        TreeNode node = root;
        for (int i = 1; i < list.size(); i++) {
            TreeNode k_node =new TreeNode();

            k_node.val = list.get(i);
            k_node.left = null;
            node.right = k_node;
            node = node.right;

        }
        node.right = null;


    }
}
