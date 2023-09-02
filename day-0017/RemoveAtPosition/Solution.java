class Solution{
 
 public void removeAt(int position)
    {
        if(position==1)
        {
            head = head.next;
        }
        else{
            Node previous = head;
            int count=1;
            while(count<position-1)
            {
                previous =previous.next;
                count++;
            }
            Node curr=previous.next;
            previous.next=curr.next;
        }
    }
}