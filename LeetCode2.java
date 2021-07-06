/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class LeetCode2 {

//     给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
//
//    请你将两个数相加，并以相同形式返回一个表示和的链表。
//
//    你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
//    输入：l1 = [2,4,3], l2 = [5,6,4]
//    输出：[7,0,8]
//    解释：342 + 465 = 807.
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode l3 = new ListNode();
//        ListNode node_l=l3;
//        int value_1,value_2,value_3;
//        value_1= getValue(l1);
//        value_2= getValue(l2);
//        value_3=value_1+value_2;
//        int present_value = value_3%10;
//        int next_value = value_3/10;
//        l3.val=present_value;
//        while (next_value>0){
//            ListNode node_k=new ListNode();
//            present_value = next_value%10;
//            next_value = next_value/10;
//            node_k.val=present_value;
//            node_l.next=node_k;
//            node_l=node_k;
//
//        }
//        return l3;
//
//
//    }
//
//    private static int getValue(ListNode listNode) {
//        int sum = listNode.val;
//        int k=1;
//        ListNode list_k= listNode.next;
//        while (list_k!=null){
//            sum+=list_k.val*Math.pow(10,k);
//            k++;
//            list_k=list_k.next;
//        }
//        return sum;
//
//    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        Boolean isplus=false;
        ListNode k1=l1;
        ListNode k2=l2;
        ListNode l3;
        if (k1.val+k2.val<10) {
            l3 = new ListNode(k1.val+k2.val);
        }else {
            isplus = true;
            l3 = new ListNode((k1.val+k2.val)%10);
        }

        ListNode k3=l3;
        k1=k1.next;
        k2=k2.next;
        while (k1!=null||k2!=null||isplus){
            int num1=0,num2=0;
            if (k1!=null)num1=k1.val;
            if (k2!=null)num2=k2.val;
            int num_sum;
            if (isplus)num_sum = num1+num2+1;
            else num_sum=num1+num2;
            ListNode p = new ListNode();
            if (num_sum<10){
                p.val=num_sum;
                isplus=false;
            }else {
                p.val=num_sum%10;
                isplus=true;
            }
            k3.next=p;
            k3=k3.next;
            if (k1!=null)k1=k1.next;
            if (k2!=null)k2=k2.next;


        }
        return l3;

}


}
