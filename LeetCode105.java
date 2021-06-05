import java.util.HashMap;
import java.util.Map;

public class LeetCode105 {
    private static Map<Integer,Integer> Indexmap;

    public static TreeNode myBuildNode(int[] preorder,int[] inorder,int preorder_left, int preorder_right,int inorder_left,int inorder_right) {

        if(preorder_left>preorder_right){
            return null;
        }
        int preorderroot = preorder_left;
        int location = Indexmap.get(preorder[preorderroot]);
        int size_leftree = location-inorder_left;
        TreeNode Nowroot = new TreeNode(preorder[preorderroot]);
        Nowroot.left = myBuildNode(preorder,inorder,preorder_left+1,preorder_left+size_leftree,inorder_left,location-1);
        Nowroot.right = myBuildNode(preorder,inorder,preorder_left+size_leftree+1,preorder_right,location+1,inorder_right);
        return Nowroot;

    }

    public TreeNode buildTree(int[] preorder,int[] inorder){
        int n = preorder.length;
        Indexmap = new HashMap<Integer, Integer>();
        for (int i = 0; i <n ; i++) {
            Indexmap.put(preorder[i],i);
        }
        return myBuildNode(preorder,inorder,0,n-1,0,n-1);
    }

}
