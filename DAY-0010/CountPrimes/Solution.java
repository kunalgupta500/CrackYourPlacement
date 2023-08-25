class Solution {
    public int countPrimes(int n) {
    boolean[] check=new boolean[n];
    return prime( n,check);
                                  }
    int prime(int n,boolean [] check)
  {   int count=0;
     for(int i=2;i*i<n;i++)
     {
     
       if(!check[i])
       {
        for(int j=i*2;j<n;j+=i)
       
         {
           check[j]=true;
         }
       }
     }

     for(int i=2;i<n;i++)
     {
       if(!check[i])
       {
        count++;
       }
     }
     return count;
 }
}