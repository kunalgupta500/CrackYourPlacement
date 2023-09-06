public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        int size1=0;
        while(temp!=null)
        {
            temp=temp.next;
            size1++;
        }
        ListNode temp2=headB;
        int size2=0;
        while(temp2!=null)
        {
            temp2=temp2.next;
            size2++;
        }
        temp=headA;
        temp2=headB;
        if(size1>size2)
        {
            int steps=size1-size2;
            for(int i=1;i<=steps;i++)
            {
             temp=temp.next;
            
            }
        }
        else
        {
            int steps=size2-size1;
            for(int i=1;i<=steps;i++)
            {
                temp2=temp2.next;
            }
        }
        
        while(temp!=temp2)
        {
            
            temp=temp.next;
            temp2=temp2.next;
        }
        return temp;
    }
}