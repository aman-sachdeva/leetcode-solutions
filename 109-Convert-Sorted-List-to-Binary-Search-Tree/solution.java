class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        return bst(head);
    }
    public TreeNode bst(ListNode head){
        if(head==null){return null;}
        if(head.next==null){return new TreeNode(head.val);}
        ListNode first=head;
        ListNode sec=head.next;
        while(sec.next!=null && sec.next.next!=null){
         first=first.next;
            sec=sec.next.next;
        }
        ListNode sec1=first.next;
        first.next=null;
        TreeNode node=new TreeNode(sec1.val);
        node.left=bst(head);
        node.right=bst(sec1.next);
        return node;
    }
}