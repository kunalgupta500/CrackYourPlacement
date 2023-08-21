import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		char ans[]=a.toCharArray();
		
		System.out.println("Enter the Character you want to change ");
		char ch=sc.next().charAt(0);;
		System.out.println("Enter the new Character you want to insert ");
		char ch2=sc.next().charAt(0);
		for(int i=0;i<ans.length;i++)
		{
		    if(ans[i]==ch)
		    {
		        ans[i]=ch2;
		    }
		}
		
		System.out.print(ans);
	
	}
}