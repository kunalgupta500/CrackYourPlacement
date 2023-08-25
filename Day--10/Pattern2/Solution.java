class Solution {

    void printTriangle(int n) {
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=(n-i+1);j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}