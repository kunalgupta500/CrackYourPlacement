class Solution
{
	public static void main(String[] args) {
		
		String str="Hello I am Kunal";
		char[] arr=str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]!=' ')
		    {
		        if(i==0)
		        {
		            System.out.print(arr[i]);
		        }
		        else if (arr[i-1]==' ')
		        {
		            System.out.print(arr[i]);
		        }
		    }
		}
	
	}
}