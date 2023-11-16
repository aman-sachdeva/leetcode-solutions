
class Solution {
    public int pairSum(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       ListNode prev=null;
       while(fast!=null && fast.next!=null){
           fast=fast.next.next;
           ListNode temp=slow.next;
           slow.next=prev;
           prev=slow;
           slow=temp;
       } 
       int res=0;
       while(slow!=null){
           res=Math.max(res,prev.val+slow.val);
           prev=prev.next;
           slow=slow.next;
       }
       return res;
    }
}