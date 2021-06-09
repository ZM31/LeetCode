import java.util.LinkedList;
import java.util.List;

public class LeetCode113 {
    List<List<Integer>> list = new LinkedList<>();
    List<Integer> now_list = new LinkedList<>();
    public void findtarget(TreeNode T,int now_targetSum,List<Integer> now_list){
        now_targetSum -=T.val;
        now_list.add(T.val);
        if((now_targetSum==0)&&(T.right==null)&&(T.left==null)){
            list.add(new LinkedList<>(now_list));
        }

        if(T.left!=null){
            findtarget(T.left,now_targetSum,now_list);
        }
        if(T.right!=null){
            findtarget(T.right,now_targetSum,now_list);


        }
        now_list.remove(now_list.size()-1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        if(root == null){
            return list;
        }
        findtarget(root,targetSum,now_list);
        return list;
    }
}
