import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int check=0;
        for(int i=1;i<=n;i++)
        {
            check=n%i;
            if(check==0)
            {
                System.out.println(i);
            }
        }
        
    }
}