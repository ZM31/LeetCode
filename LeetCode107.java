import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LeetCode107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root==null){
            return list;
        }

        Queue<TreeNode> que = new LinkedList<>();
        TreeNode node = root;
        que.add(node);
        while (!que.isEmpty()){
            int current_size = que.size();
            List<Integer> list_in = new LinkedList<>();
            while (current_size!=0){
                TreeNode node_in =que.poll();
                list_in.add(node_in.val);
                if(node_in.left!=null)que.add(node_in.left);
                if(node_in.right!=null)que.add(node_in.right);
                current_size--;
            }
            list.add(0,list_in);
        }
        return  list;
    }
}