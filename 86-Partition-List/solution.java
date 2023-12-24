class Solution {
    public ListNode partition(ListNode head, int x) {
       ListNode list1=new ListNode(0);
       ListNode list2=new ListNode(0);
        ListNode l1=list1;
        ListNode l2=list2;
        while(head!=null){
          if(head.val<x){
           list1.next=head;
              list1=list1.next;
          }else{
           list2.next=head;
              list2=list2.next;
          }
            head=head.next;
        }
        list1.next=l2.next;
        list2.next=null;
        return l1.next;
    }
}