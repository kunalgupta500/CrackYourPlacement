class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null)
        {
            return true;
        }
        ListNode middle=middleNode(head);
        ListNode reverse = reversell(middle);
        while(reverse!=null)
        {
            if(reverse.val!=head.val)
            {
                return false;
            }
            reverse = reverse.next;
            head= head.next;
        }
        return true;
    }

        public ListNode middleNode(ListNode head){
            ListNode slow=head;
            ListNode fast= head;
            while(fast.next!=null  && fast.next.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            if(fast.next!=null)
            {
                slow=slow.next;
            }
            return slow;
        }

        public ListNode reversell(ListNode head){
            if(head==null)
            {
                return null;
            }
        ListNode curr=head;
        ListNode prev=null;
      
        while(curr!=null)
        {
            ListNode after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
       return prev;
        }
    }
