class Solution{
 
 public void removeLast(){
        if(head==null)
        {
            System.out.println("List is empty, Nothing to remove");
        }
        else if(head.next==null)
        {
            head=null;
        }
        else if(head.next!=null)
        {
            Node curr = head;
            while(curr.next.next!=null)
            {
                curr=curr.next;
            }
            curr.next=null;
        }
    }
}