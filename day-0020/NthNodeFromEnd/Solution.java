class Solution {
    public void findNodeFromEnd(ListNode head,int n) {
        ListNode slow=head;
        ListNode fast=head;
        for(int i=1;i<=n;i++)
        {
          fast=fast.next;
        }
        while(fast!=null)
        {
          slow=slow.next;
          fast=fast.next;
        }
        return slow;
    }
}