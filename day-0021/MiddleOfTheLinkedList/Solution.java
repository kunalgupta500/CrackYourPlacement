class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int size=0;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        int start=(size/2);
        temp=head;
        for(int i=1;i<=start;i++)
        {
            temp=temp.next;
        }
        while(temp!=null)
        {
            return temp;
        }
        return temp;
    }
}