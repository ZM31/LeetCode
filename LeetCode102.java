import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class LeetCode102 {

//    public boolean isValidBST(TreeNode root) {
//        if (isvalid(root)>0){
//            return false;
//        }else return true;
//
//    }
//    public  int isvalid(TreeNode root){
//        if(root==null){
//            return 0;
//        }else if((root.right!=null&&root.right.val>root.val)||(root.left!=null&&root.val<root.left.val)){
//            return 1;
//
//        }else return isvalid(root.right)+isvalid(root.left);
//    }
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if(root==null){
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> level = new ArrayList<Integer>();
            int CurrentSize = queue.size();
            for (int i = 1; i <=CurrentSize ; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.right!=null){
                    queue.add(node.right);
                }
                if (node.left!=null){
                    queue.add(node.left);
                }

            }
            ret.add(level);

        }
        return ret;
    }
}
