import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
        System.out.println("Enter string");
        String a= ab.next();
		
		System.out.println(a);
	    System.out.println("Enter index from where you want to extract string");
        int b= ab.nextInt();
		 for(int i=b;i<a.length();i++)
        {
            System.out.print(a.charAt(i));
        }
        
	}
}