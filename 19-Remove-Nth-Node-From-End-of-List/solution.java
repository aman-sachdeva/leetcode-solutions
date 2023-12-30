
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next=head;
     ListNode frwd=start;
     ListNode prev =start;
        // if(frwd.next==null){  
        //     return null;
        // }
      for(int i=0;i<n;i++){
          frwd=frwd.next;
      }
      while(frwd.next!=null){
          frwd=frwd.next;
          prev=prev.next;
      }
    prev.next=prev.next.next; 
    return start.next;
    }
}