import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two nembers n1 and n2");
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        int gcd=0;
        for(int i=2;i<Math.max(n1,n2);i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                gcd=i;
            }
        }
        System.out.print(" "+gcd);
    
}
}