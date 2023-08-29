import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter the data");
        int x=abc.nextInt();
        int[] arr={10,20,30,40,50,60,70,80,90};
        test ab=new test();
        ab.search(int[] arr, x);
    }
}
class test
{
    int search(int arr[], int x)
    {
        for(int i=0;i<9;i++)
       {
           if(arr[i]==x)
           {
               return i;
           }
           
       }
       return -1;
    }
}