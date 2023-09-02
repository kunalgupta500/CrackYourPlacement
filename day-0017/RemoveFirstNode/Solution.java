class Solution{
 
  public void removeFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty, Nothing to remove");
        }
        else
        {
            head= head.next;
        }
    }
}