import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode106 {
    Map<Integer,Integer> indexMap = new HashMap<>();


    public TreeNode myNode(int[] inorder, int[] postorder, int inorder_left, int inorder_right, int post_left, int post_right){
        if((post_left>post_right) || (inorder_left>inorder_right)){
            return null;
        }
        int post_root = post_left;
        int inorder_root = indexMap.get(postorder[post_root]);
        int leftnum = inorder_root - inorder_left;
//        int rightnum = inorder_right - inorder_root;
        TreeNode root = new TreeNode(postorder[post_root]);
        root.left = myNode(inorder,postorder,inorder_left,inorder_root-1,post_left,post_left+leftnum-1);
        root.right = myNode(inorder,postorder,inorder_root+1,inorder_right,post_right+leftnum,post_right-1);

        return root;
    }


    public  TreeNode buildTree(int[] inorder, int[] postorder){
        int n = inorder.length;
//        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i],i);
        }

        return myNode(inorder,postorder,0,n-1,0,n-1);





    }

//    public static void main(String[] args) {
//        TreeNode T ;
//        int a[]={9,3,15,20,7};
//        int b[] = {9,15,7,20,3};
//        T = buildTree(a,b);
//    }

}



