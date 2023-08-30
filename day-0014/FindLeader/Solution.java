import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> element=new ArrayList<Integer> ();
		element.add(5);
		element.add(12);
		element.add(11);
		element.add(10);
		element.add(9);
		
		for(int i=0;i<element.size();i++)
		{
		    int j;
		    for( j=i+1;j<element.size();j++)
		    {
		        
		        if(element.get(i)<=element.get(j))
		        {
		            break;
		        }
		    }  
		    if(j==element.size())
		     {
		        System.out.println(element.get(i)+"is a leader");
		     }
		        
		    
		}
	}
}
