import java.util.LinkedList;
import java.util.Queue;

public class LeetCode116 {
//    给定一个 完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
//
//    struct Node {
//        int val;
//        Node *left;
//        Node *right;
//        Node *next;
//    }
//    填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
//
//    初始状态下，所有 next 指针都被设置为 NULL。
    public Node connect(Node root) {
        if (root==null){
            return root;
        }
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            int current_size = que.size();
            Node node = que.poll();
            current_size--;
            if(node.right!=null)que.add(node.right);
            if (node.left!=null)que.add(node.left);
            while (current_size>0){
                Node k_node = que.poll();
                k_node.next = node;
                if(k_node.right!=null)que.add(k_node.right);
                if(k_node.left!=null)que.add(k_node.left);
                node = k_node;
                current_size--;
            }

        }
        return root;

    }
}
