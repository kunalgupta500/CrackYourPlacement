class Solution {
     public int pairSum(ListNode head) {
     ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

       

        ListNode rev = null;
        ListNode curr = head;
        while(curr != slow) {
            ListNode temp = curr.next;
            curr.next = rev;
            rev = curr;
            curr = temp;
        }

        ListNode back = rev;
        ListNode front = slow;
        int ans = 0;
        while(back != null) {
            ans = Math.max(ans , front.val + back.val);
            front = front.next;
            back = back.next;
        }
        return ans;
 }

}