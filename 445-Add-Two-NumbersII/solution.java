
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1=listtostack(l1);
        Stack<Integer> s2=listtostack(l2);
        ListNode head=null;
        int carry=0;
        while(!s1.isEmpty() || !s2.isEmpty() || carry!=0){
            int sum=carry;
            if(!s1.isEmpty()){sum+=s1.pop();}
            if(!s2.isEmpty()){sum+=s2.pop();}
            ListNode newnode=new ListNode(sum%10);
            newnode.next=head;
            head=newnode;
            carry=sum/10;
        }
        return head;
    }
    public Stack<Integer> listtostack(ListNode x){
        Stack<Integer> s=new Stack();
        while(x!=null){
            s.add(x.val);
            x=x.next;
        }
        return s;
    }
}